package com.jll.stickrmgr.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "userdata")
public class UserData {
	
	@Id
	@Column(unique = true)
	private String username;		

	@Column
	private String password;
	
	@OneToMany(mappedBy="user")
	private List<Deck> deck;	
	
	public UserData(){}
	
	public UserData(String userName, String aPassw) {
		username = userName;
		password = aPassw;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUsername(String user){
		this.username = user;
	}
	
	public void setPassword(String pwd){
		this.password = pwd;
	}
}
