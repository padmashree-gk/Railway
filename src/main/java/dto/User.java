package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.servlet.http.HttpServlet;

import lombok.Data;


@Entity
@Data
public class User 
{
@Id
@GeneratedValue(generator = "x")
@SequenceGenerator(name="x",sequenceName = "x",initialValue = 1234561, allocationSize = 1)
int id;
String firstname;
String Lastname;
String email;
long mobile;
String gender;
String Password;
Date dob;
int age;
double wallet;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getWallet() {
	return wallet;
}
public void setWallet(double wallet) {
	this.wallet = wallet;
}

	
	
	
	
}
