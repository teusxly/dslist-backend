package com.devteusxly.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devteusxly.dslist.entities.Game;

public class GameDTO {

	private long id;
	private String title; //titulo
	private Integer year; //ano
	private String genre; //genero
	private String platforms; //plataformas
	private Double score; // ponstuacao
	private String imgUrl; // url da imagem
	private String ShortDescription; // descricao resumida
	private String longDescription; // descricao longa
	
	public GameDTO() {
	}
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getShortDescription() {
		return ShortDescription;
	}
	public void setShortDescription(String shortDescription) {
		ShortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
	
	
	
}
