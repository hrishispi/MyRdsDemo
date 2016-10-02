package com.rdstest;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	private String emailId;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private List<Address> addressList;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "contact_id")
	private Contact contactId;
	
	private Integer petId;
	
	private String profileImage;
	
	private String activeInd;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Address> getAddressId() {
		return addressList;
	}

	public void setAddressId(List<Address> addressId) {
		this.addressList = addressId;
	}

	public Contact getContactId() {
		return contactId;
	}

	public void setContactId(Contact contactId) {
		this.contactId = contactId;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

}
