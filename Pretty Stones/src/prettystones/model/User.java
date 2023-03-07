package prettystones.model;

public class User {
private  String username;
private String password;
private String contactNo;
private String emailId;
private String city;
private String state;
private String country;

public User() {
	super();
}

public User(String username, String password, String contactNo, String emailId, String city, String state,
		String country) {
	super();
	this.username = username;
	this.password = password;
	this.contactNo = contactNo;
	this.emailId = emailId;
	this.city = city;
	this.state = state;
	this.country = country;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getContactNo() {
	return contactNo;
}

public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", contactNo=" + contactNo + ", emailId=" + emailId
			+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
}


}
