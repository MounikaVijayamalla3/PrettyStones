package prettystones.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import prettystones.connection.CustomConnection1;
import prettystones.model.GiftCard;
import prettystones.model.Installments;
import prettystones.model.Investments;
import prettystones.model.Store;
import prettystones.model.User;

public class MenuOfServicesImpl implements MenuOfServices {
    Connection connection=null;
    PreparedStatement pStatement=null;
    public MenuOfServicesImpl() throws SQLException {
    	connection=CustomConnection1.getConnection();
    }
	@Override
	public void addUser(User user) throws SQLException {
		pStatement = connection.prepareStatement("insert into userinformation values(?,?,?,?,?,?,?)");
		pStatement.setString(1, user.getUsername());
		pStatement.setString(2, user.getPassword());
		pStatement.setString(3, user.getContactNo());
		pStatement.setString(4, user.getEmailId());
		pStatement.setString(5, user.getCity());
		pStatement.setString(6, user.getState());
		pStatement.setString(7, user.getCountry());
		int res=pStatement.executeUpdate();
		if(res==1) {
			System.out.println(":->------Created Account successfully------:->");
		}
	}

	@Override
	public void findUserByContactNo(String contactNo) throws SQLException {
    pStatement = connection.prepareStatement("select *from userInformation where contactNo=?");
	pStatement.setString(1, contactNo);
	ResultSet rs=pStatement.executeQuery();
	rs.next();
	User user=new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
	System.out.println("Logged successfully");
}
	@Override
	public User myPofile(String contactNo) throws SQLException {
		 pStatement = connection.prepareStatement("select *from userInformation where contactNo=?");
			pStatement.setString(1, contactNo);
			ResultSet rs=pStatement.executeQuery();
			rs.next();
			User user=new User(rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6),
					rs.getString(7));
		return user;
	}
	@Override
	public Store storeLocatorByPincode(int pincode) throws SQLException {
		pStatement = connection.prepareStatement("select *from storelocator where pincode=?");
		pStatement.setInt(1, pincode);
		ResultSet rs = pStatement.executeQuery();
	    rs.next();
		Store store = new Store(rs.getInt(1),rs.getString(2),rs.getString(3));
		return store;
	}
	@Override
	public void addInstallmentOfUser(Installments installments) throws SQLException {
		pStatement = connection.prepareStatement("insert into installments values(?,?,?,?,?)");
		pStatement.setString(1, installments.getMobileNo());
		pStatement.setInt(2, installments.getAmount());
		pStatement.setInt(3, installments.getNoOfInstallments());
		pStatement.setInt(4, installments.getAmountOfInstallments());
		pStatement.setInt(5, installments.getCompletedInstallments());
		int res=pStatement.executeUpdate();
		if(res==1) {
			System.out.println("Installemnt generated successfully");
		}
	}
	@Override
	public void addGiftCard(GiftCard giftcard) throws SQLException {
		pStatement = connection.prepareStatement("insert into giftcard values(?,?,?)");
		pStatement.setString(1, giftcard.getSender_mobileNo() );
		pStatement.setString(2, giftcard.getReceiver_mobileNo());
		pStatement.setInt(3, giftcard.getGiftcard_worth());
		int res=pStatement.executeUpdate();
		if(res==1) {
			System.out.println("Gift Card sended successfully");
		}
		
	}
	@Override
	public void addInvestment(Investments investments) throws SQLException {
		pStatement = connection.prepareStatement("insert into investments values(?,?,?)");
		pStatement.setString(1, investments.getInvester_mobileNo());
		pStatement.setInt(2, investments.getInvestment_amount());
		pStatement.setInt(3, investments.getCompleted_months());
		int res=pStatement.executeUpdate();
		if(res==1) {
			System.out.println("Invested successfully");
		}
	}
	@Override
	public Installments viewInstallments(String mobileNo) throws SQLException {
		 pStatement = connection.prepareStatement("select *from installments where mobileNo=?");
			pStatement.setString(1, mobileNo);
			ResultSet rs=pStatement.executeQuery();
			rs.next();
			Installments installments=new Installments(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));

		return installments;
	}
	@Override
	public Investments viewInvestment( String invester_mobileNo) throws SQLException {
		 pStatement = connection.prepareStatement("select *from investments where invester_mobileNo=?");
			pStatement.setString(1, invester_mobileNo);
			ResultSet rs=pStatement.executeQuery();
			rs.next();
			Investments investments=new Investments(rs.getString(1),rs.getInt(2),rs.getInt(3));
		return investments;
	}
	@Override
	public GiftCard viewGiftCard(String sender_mobileNo ) throws SQLException {
		 pStatement = connection.prepareStatement("select *from giftcard where sender_mobileNo=?");
			pStatement.setString(1, sender_mobileNo);
			ResultSet rs=pStatement.executeQuery();
			rs.next();
			GiftCard giftCard=new GiftCard(rs.getString(1),rs.getString(2),rs.getInt(3));

		return giftCard;
	}
}