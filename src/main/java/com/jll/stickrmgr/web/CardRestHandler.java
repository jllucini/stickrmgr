package com.jll.stickrmgr.web;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jll.stickrmgr.domain.CardDTO;

public class CardRestHandler extends TextWebSocketHandler {
	 
	private static final Logger LOGGER = LoggerFactory.getLogger(CardRestHandler.class);
	
	protected void handleTextMessage(WebSocketSession session, TextMessage message){
		LOGGER.info("Received Message: {}", message.getPayload());
		ObjectMapper mapper = new ObjectMapper();
		JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, CardDTO.class);
		try {
			List<CardDTO> lCards = mapper.readValue(message.getPayload(), type);
			LOGGER.info("List of cards: {}", lCards);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
