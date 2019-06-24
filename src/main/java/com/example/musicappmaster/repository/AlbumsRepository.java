package com.example.musicappmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.musicappmaster.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}