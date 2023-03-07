package prettystones.service;

import java.sql.SQLException;

import prettystones.model.GiftCard;
import prettystones.model.Installments;
import prettystones.model.Investments;
import prettystones.model.Store;
import prettystones.model.User;

public interface MenuOfServices {
public void addUser(User user)  throws SQLException ;
public void findUserByContactNo(String contactNo) throws SQLException;
public User myPofile(String user) throws SQLException;
public Store storeLocatorByPincode(int pincode) throws SQLException;
public void addInstallmentOfUser(Installments installments) throws SQLException;
public void addGiftCard(GiftCard giftcard) throws SQLException;
public void addInvestment(Investments investments) throws SQLException;
public Installments viewInstallments(String mobileNo) throws SQLException;
public Investments viewInvestment(String investor_mobileNo) throws SQLException;
public GiftCard viewGiftCard(String giftCard_sender) throws SQLException;
}
