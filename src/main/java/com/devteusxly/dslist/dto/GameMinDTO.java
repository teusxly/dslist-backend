package com.devteusxly.dslist.dto;

import com.devteusxly.dslist.entities.Game;
import com.devteusxly.dslist.projections.GameMinProjection;

public class GameMinDTO {


	private long id;
	private String title; //titulo
	private Integer year; //ano
	private String imgUrl; // url da imagem
	private String ShortDescription; // descricao resumida
	
	GameMinDTO() {
	}

	public GameMinDTO(Game entitiy) {
		id = entitiy.getId();
		title = entitiy.getTitle();
		year = entitiy.getYear();
		imgUrl = entitiy.getImgUrl();
		ShortDescription = entitiy.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		ShortDescription = projection.getShortDescription();
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
