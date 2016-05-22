package com.jll.stickrmgr.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "deck")
public class Deck {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="name")
	private String name;	

	@OneToMany(mappedBy="deck")
	private List<Card> card;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserData user;
	
	public Deck() {}
	
	public Deck(String name, UserData user) {
		this.name = name;
		this.user = user;
	}

	public UserData getUser(){
		return user;
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setUser(UserData userData) {
		this.user = userData;
	}
	
}
