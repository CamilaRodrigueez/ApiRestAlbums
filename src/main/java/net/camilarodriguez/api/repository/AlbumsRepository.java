package net.camilarodriguez.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.camilarodriguez.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
