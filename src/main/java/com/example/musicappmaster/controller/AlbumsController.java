package com.example.musicappmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.musicappmaster.service.IAlbumsService;

import com.example.musicappmaster.entity.Album;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumsService serviceAlbums;
	
	@GetMapping("/")
	public String inicio() 
	{
		return "Albums";
	}
	
	@GetMapping("/albums")
	public List<Album> buscarTodos()
	{
		return serviceAlbums.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) 
	{
		serviceAlbums.guardar(album);
		return album;
	}

}
