package net.camilarodriguez.api.services;

import java.util.List;


import net.camilarodriguez.api.entity.Album;

public interface IAlbumsService {
	List<Album> buscarTodos();
	void guardar(Album album);
	
	void eliminar(int idAlbum);
}
