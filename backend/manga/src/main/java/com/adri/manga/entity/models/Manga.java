package com.adri.manga.entity.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name = "mangas")
public class Manga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	String name;

	String synopsis;

	int chapter;

	@JsonIgnore
	@ManyToMany(mappedBy = "mangasInUser")
	Set<User> usersWhereToFindThisManga = new HashSet<>();

	public Manga(String name, String synopsis, int chapter) {
		super();
		this.name = name;
		this.synopsis = synopsis;
		this.chapter = chapter;
	}
	
	public Manga() {

	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Set<User> getUsersWhereTofindThisManga() {
		return usersWhereToFindThisManga;
	}

	public void setUsersWhereTofindThisManga(Set<User> usersWhereToFindThisManga) {
		this.usersWhereToFindThisManga = usersWhereToFindThisManga;
	}
}
