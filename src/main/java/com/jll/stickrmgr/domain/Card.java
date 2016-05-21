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

@Entity
public class Card implements Serializable {
	
	private static final long serialVersionUID = 1L;

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
	
	@Column(name="num_cards")
	private int count = 0;	
	
	public Card() {}
	
	public Card(String code, String description, Deck deck) {
		this.code = code;
		this.description = description;
		this.deck = deck;
		this.count = 1;
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
	
	public int getCount(){
		return count;
	}
	
	public void setCount(int count){
		this.count = count;
	}
}
