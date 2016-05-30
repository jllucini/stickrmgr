package com.jll.stickrmgr.domain;

import java.io.Serializable;

public class DeckDTO  implements Serializable { 

	private static final long serialVersionUID = 9370354750747991L;
	
	private String name;
	
	public DeckDTO() {}
	
	public DeckDTO(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
