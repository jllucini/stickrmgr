package com.jll.stickrmgr.domain;

import java.io.Serializable;

// Data Transfer Object
public class CardDTO  implements Serializable{

	private static final long serialVersionUID = -4741114713806223688L;

	private String code;	

	private String description;
	
	public CardDTO(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
}
