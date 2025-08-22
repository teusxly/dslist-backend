package com.devteusxly.dslist.entities;

	import java.util.Objects;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "tb_game")
	public class Game {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String title; //titulo
		
		@Column(name = "game_year")
		private Integer year; //ano
		private String genre; //genero
		private String platforms; //plataformas
		private Double score; // ponstuacao
		private String imgUrl; // url da imagem
		@Column(columnDefinition = "TEXT")
		private String ShortDescription; // descricao resumida
		@Column(columnDefinition = "TEXT")
		private String longDescription; // descricao longa
		
		public Game() {
			
		}

		public Game(long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
				String shortDescription, String longDescription) {
			this.id = id;
			this.title = title;
			this.year = year;
			this.genre = genre;
			this.platforms = platforms;
			this.score = score;
			this.imgUrl = imgUrl;
			ShortDescription = shortDescription;
			this.longDescription = longDescription;
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

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Game other = (Game) obj;
			return id == other.id;
		}

		
		
}
