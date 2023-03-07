package prettystones.model;

public class Investments {

  String invester_mobileNo;
  int investment_amount;
  int completed_months;
	
	public Investments() {
		super();
	}
	public Investments(String invester_mobileNo, int investment_amount, int completed_months) {
		super();
		this.invester_mobileNo = invester_mobileNo;
		this.investment_amount = investment_amount;
		this.completed_months = completed_months;
	}
	public String getInvester_mobileNo() {
		return invester_mobileNo;
	}
	public void setInvester_mobileNo(String invester_mobileNo) {
		this.invester_mobileNo = invester_mobileNo;
	}
	public int getInvestment_amount() {
		return investment_amount;
	}
	public void setInvestment_amount(int investment_amount) {
		this.investment_amount = investment_amount;
	}
	public int getCompleted_months() {
		return completed_months;
	}
	public void setCompleted_months(int completed_months) {
		this.completed_months = completed_months;
	}
	@Override
	public String toString() {
		return "Investments [invester_mobileNo=" + invester_mobileNo + ", investment_amount=" + investment_amount
				+ ", completed_months=" + completed_months + "]";
	}
	
}
