package com.jll.stickrmgr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "card")
public class Card  {
	
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
	
	public Long getId() {
		return id;
	}
	
	public void setDeck(Deck aDeck){
		deck = aDeck;
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

	public void incrementCount() {
		this.count += 1;
	}
	
	public void substractCount() {
		this.count -= 1;
	}
	
	public CardDTO getDTO(){
		return new CardDTO(this.code, this.description);
	}
	
}
