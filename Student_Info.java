package org.deloitte.sms.studentstaffdetailsmanagement.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="STUDENT_INFO")
public class Student_Info {
	private String student_Id;
	private String student_Name;
	private Date   date_Of_Birth;
	private char guardian_Type;
	private String guardian_Name;
	private String address;
	private String country_Id;
	private long contact_No;
	private String Mail_Id;
	private char gender;
	private String standard;
	private char standard_Category;
	private char transport;
	private double net_Fees;
	public String getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(String student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}
	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}
	public char getGuardian_Type() {
		return guardian_Type;
	}
	public void setGuardian_Type(char guardian_Type) {
		this.guardian_Type = guardian_Type;
	}
	public String getGuardian_Name() {
		return guardian_Name;
	}
	public void setGuardian_Name(String guardian_Name) {
		this.guardian_Name = guardian_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(String country_Id) {
		this.country_Id = country_Id;
	}
	public long getContact_No() {
		return contact_No;
	}
	public void setContact_No(long contact_No) {
		this.contact_No = contact_No;
	}
	public String getMail_Id() {
		return Mail_Id;
	}
	public void setMail_Id(String mail_Id) {
		Mail_Id = mail_Id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public char getStandard_Category() {
		return standard_Category;
	}
	public void setStandard_Category(char standard_Category) {
		this.standard_Category = standard_Category;
	}
	public char getTransport() {
		return transport;
	}
	public void setTransport(char transport) {
		this.transport = transport;
	}
	public double getNet_Fees() {
		return net_Fees;
	}
	public void setNet_Fees(double net_Fees) {
		this.net_Fees = net_Fees;
	}











}
