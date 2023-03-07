package prettystones.model;

public class GiftCard {
  String sender_mobileNo;
  String receiver_mobileNo;
  int giftcard_worth;
public GiftCard(String sender_mobileNo, String receiver_mobileNo, int giftcard_worth) {
	super();
	this.sender_mobileNo = sender_mobileNo;
	this.receiver_mobileNo = receiver_mobileNo;
	this.giftcard_worth = giftcard_worth;
}
public String getSender_mobileNo() {
	return sender_mobileNo;
}
public void setSender_mobileNo(String sender_mobileNo) {
	this.sender_mobileNo = sender_mobileNo;
}
public String getReceiver_mobileNo() {
	return receiver_mobileNo;
}
public void setReceiver_mobileNo(String receiver_mobileNo) {
	this.receiver_mobileNo = receiver_mobileNo;
}
public int getGiftcard_worth() {
	return giftcard_worth;
}
public void setGiftcard_worth(int giftcard_worth) {
	this.giftcard_worth = giftcard_worth;
}
@Override
public String toString() {
	return "GiftCard [sender_mobileNo=" + sender_mobileNo + ", receiver_mobileNo=" + receiver_mobileNo
			+ ", giftcard_worth=" + giftcard_worth + "]";
}
  
}