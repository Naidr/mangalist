package com.adri.manga.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.manga.entity.dao.IMangaDaoUsers;
import com.adri.manga.entity.models.User;

@Service
public class MangaServiceUsersImpl implements IMangaServiceUsers {

	@Autowired
	private IMangaDaoUsers userDao;

	@Override
	public List<User> getAll() {
		return (List<User>) userDao.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userDao.findById(id).orElse(null);
	}

	@Override
	public void post(User user) {
		userDao.save(user);
	}

	@Override
	public void put(User user, long id) {
		userDao.findById(id).ifPresent((x) -> {
			user.setId(id);
			userDao.save(user);
		});
	}
}
