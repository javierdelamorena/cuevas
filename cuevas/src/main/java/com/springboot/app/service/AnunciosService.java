package com.springboot.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.springboot.app.entity.Anuncios;

public interface AnunciosService {
	
	List<Anuncios> listAnuncio();
	
	
	void insertarAnucio(String anuncio,String titulo,MultipartFile file) throws IOException;
	
	
	Anuncios recuperarAnuncio(int idAnuncio);
	
	
	void deleteAnuncio(int idAnuncio);
	
	
	void editarAnuncio(Anuncios editable,String anuncio,String titulo,String fecha,MultipartFile file);

}
