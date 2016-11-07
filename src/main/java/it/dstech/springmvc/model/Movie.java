package it.dstech.springmvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "MOVIE")
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;

	@NotEmpty
	@Column(name = "TITLE", unique = true, nullable = false)
	private String title;

	@NotEmpty
	@Column(name = "YEAR", nullable = false)
	private Integer year;

	@NotEmpty
	@Column(name = "DURATION", nullable = false)
	private Integer duration;

	@ManyToMany
	@JoinTable(name = "MOVIE_GENRE", joinColumns = @JoinColumn(name = "MOVIE_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "GENRE_ID", referencedColumnName = "ID"))
	private List<Genre> genreList;

	@ManyToMany
	@JoinTable(name = "MOVIE_ACTOR", joinColumns = @JoinColumn(name = "MOVIE_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ACTOR_ID", referencedColumnName = "ID"))
	private List<Actor> actorList;

	@NotEmpty
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DIRECTOR")
	private Director director;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
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

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public List<Genre> getGenre() {
		return genreList;
	}

	public void setGenre(List<Genre> genre) {
		this.genreList = genre;
	}

	public List<Genre> getGenreList() {
		return genreList;
	}

	public void setGenreList(List<Genre> genreList) {
		this.genreList = genreList;
	}

	public List<Actor> getActorList() {
		return actorList;
	}

	public void setActorList(List<Actor> actorList) {
		this.actorList = actorList;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

}
