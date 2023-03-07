package prettystones.model;

public class Store {
 int pincode;
 String city;
 String Address;
public Store(int pincode, String city, String address) {
	super();
	this.pincode = pincode;
	this.city = city;
	Address = address;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "Store [pincode=" + pincode + ", city=" + city + ", Address=" + Address + "]";
}
 
}
