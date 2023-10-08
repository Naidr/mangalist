package com.adri.manga.entity.services;

import java.util.List;

import com.adri.manga.entity.models.User;

public interface IMangaServiceUsers {
	public List<User> getAll();
	public User getUserById(long id);
	public void post(User user);
	public void put(User user,long id);
}
