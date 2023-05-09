package net.camilarodriguez.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.camilarodriguez.api.entity.Album;
import net.camilarodriguez.api.services.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	
	@Autowired
	private IAlbumsService servicesAlbums;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return servicesAlbums.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		servicesAlbums.guardar(album);
		
		return album;
	}
	
	
	@PutMapping("/albums")
	public Album Modificar(@RequestBody Album album) {
		servicesAlbums.guardar(album);
		
		return album;
	}
	
	@DeleteMapping("/albums/{id}")
	public String Eliminar(@PathVariable("id") int idAlbum) {
		servicesAlbums.eliminar(idAlbum);
		
		return "Registro Eliminado Satisfactoriamente!";
	}
}
