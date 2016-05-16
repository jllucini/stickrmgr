package com.jll.stickrmgr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Card implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="code")
	private String code;	

	@Column(name="descr")
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deck_id")
	private Deck deck;
	
	private Card() {}
	
	public Card(String code, String description, Deck deck) {
		this.code = code;
		this.description = description;
		this.deck = deck;
	}
	
	public void setDeck(Deck aDeck){
		deck = aDeck;
	}
	
	public Long getId() {
		return id;
	}

	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Deck getDeck(){
		return deck;
	}
}