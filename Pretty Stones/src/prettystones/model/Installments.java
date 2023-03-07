package prettystones.model;

public class Installments {
String mobileNo;
int amount;
int noOfInstallments;
int amountOfInstallments;
int completedInstallments;

public Installments(String contactNo,int amount, int noOfInstallments, int amountOfInstallments, int completedInstallments) {
	super();
	this.mobileNo = contactNo;
	this.amount = amount;
	this.noOfInstallments = noOfInstallments;
	this.amountOfInstallments = amountOfInstallments;
	this.completedInstallments = completedInstallments;
	
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getNoOfInstallments() {
	return noOfInstallments;
}
public void setNo_Of_Installments(int noOfInstallments) {
	this.noOfInstallments = noOfInstallments;
}
public int getAmountOfInstallments() {
	return amountOfInstallments;
}
public void setAmountOfInstallments(int amountOfInstallments) {
	this.amountOfInstallments = amountOfInstallments;
}
public int getCompletedInstallments() {
	return completedInstallments;
}
public void setCompletedInstallments(int completedInstallments) {
	this.completedInstallments = completedInstallments;
}
@Override
public String toString() {
	return "Installments [mobileNo=" + mobileNo + ", amount=" + amount + ", noOfInstallments=" + noOfInstallments
			+ ", amountOfInstallments=" + amountOfInstallments + ", completedInstallments=" + completedInstallments + "]";
}



}