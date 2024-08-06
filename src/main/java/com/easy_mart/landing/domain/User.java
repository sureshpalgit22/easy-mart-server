package com.easy_mart.landing.domain;
import java.time.LocalDate;
import java.util.List;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "easymart_user")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    
    
    //for saller
    private String name;
    private String mobile;
    private List<String> roles;
    private String panCard;
    private Address sallerAddress;
    private List<Address> userAddress;

    private LocalDate dateOfBarth;



    
    private String mobileNumber;
    private List <String> role;

    // Constructors
    public User() {}

   
  


	public User(String id, String username, String password, String email, String name, String mobile,
			List<String> roles, String panCard, Address sallerAddress, List<Address> userAddress,
			LocalDate dateOfBarth) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.roles = roles;
		this.panCard = panCard;
		this.sallerAddress = sallerAddress;
		this.userAddress = userAddress;
		this.dateOfBarth = dateOfBarth;
	}





	// Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getPanCard() {
		return panCard;
	}

	

	public void setAddress(Address address) {
		this.sallerAddress = address;
	}

	public Address getSallerAddress() {
		return sallerAddress;
	}


	public void setSallerAddress(Address sallerAddress) {
		this.sallerAddress = sallerAddress;
	}


	public List<Address> getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(List<Address> userAddress) {
		this.userAddress = userAddress;
	}


	public LocalDate getDateOfBarth() {
		return dateOfBarth;
	}

	public void setDateOfBarth(LocalDate dateOfBarth) {
		this.dateOfBarth = dateOfBarth;
	}
    
    

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}
	
	
    
}
