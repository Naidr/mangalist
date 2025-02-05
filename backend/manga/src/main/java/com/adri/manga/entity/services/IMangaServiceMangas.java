package com.adri.manga.entity.services;

import java.util.List;

import com.adri.manga.entity.models.Manga;

public interface IMangaServiceMangas {
	public List<Manga> getAll();
	public List<Manga> getAllMangasInUser(long id);
	//public void post(Manga manga);
	public void post(Manga manga, long userId);
	public void put(Manga manga, long userId, long mangaId);
	public void delete(long userId, long mangaId);
//	public void put(Manga manga,long id);
//	public void delete(long id);
}
