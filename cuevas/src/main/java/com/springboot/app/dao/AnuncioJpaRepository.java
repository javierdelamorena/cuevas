package com.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.entity.Anuncios;

public interface AnuncioJpaRepository extends JpaRepository<Anuncios,Integer>{
	
	

}
