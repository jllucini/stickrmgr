package com.jll.stickrmgr.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Deck {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="name")
	private String name;	

	@OneToMany(mappedBy="deck")
	private List<Card> card;
	  
	public Long getId() {
		return id;
	}
	
	public Deck(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
