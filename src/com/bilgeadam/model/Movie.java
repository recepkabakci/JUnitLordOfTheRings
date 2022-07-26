package com.bilgeadam.model;

import java.util.Date;

public class Movie {
	
	private String title;
	private Date releaseDate;
	private String duration;
	
	public Movie(String title, Date releaseDate, String duration) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public String getDuration() {
		return duration;
	}
	
	
	
}
