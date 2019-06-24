package com.example.musicappmaster.service;

import java.util.List;

import com.example.musicappmaster.entity.Album;

public interface IAlbumsService {
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
