package com.devteusxly.dslist.dto;

import com.devteusxly.dslist.entities.Game;

public class GameMinDTO {


	private long id;
	private String title; //titulo
	private Integer year; //ano
	private String imgUrl; // url da imagem
	private String ShortDescription; // descricao resumida
	
	GameMinDTO() {
	}

	public GameMinDTO(Game entitiy) {
		this.id = entitiy.getId();
		this.title = entitiy.getTitle();
		this.year = entitiy.getYear();
		this.imgUrl = entitiy.getImgUrl();
		ShortDescription = entitiy.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return ShortDescription;
	}
	
}
