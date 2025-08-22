package com.devteusxly.dslist.dto;

import com.devteusxly.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	GameListDTO(){
	}
	
	public GameListDTO(GameList entity){
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
