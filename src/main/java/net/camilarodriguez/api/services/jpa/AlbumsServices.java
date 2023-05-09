package net.camilarodriguez.api.services.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.camilarodriguez.api.entity.Album;
import net.camilarodriguez.api.repository.AlbumsRepository;
import net.camilarodriguez.api.services.IAlbumsService;

@Service
public class AlbumsServices implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	@Override
	public List<Album> buscarTodos() {
		
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}
	@Override
	public void guardar(Album album) {
		// TODO Auto-generated method stub
		
		repoAlbums.save(album);
	}
	@Override
	public void eliminar(int idAlbum) {
		// TODO Auto-generated method stub
		repoAlbums.deleteById(idAlbum);
	}

}
