package br.com.resenhascabelisticas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.resenhascabelisticas.model.Forum;



public interface ForumRepository {

@Repository
public interface PostagemRepository extends JpaRepository<Forum, Long> {

	public List<Forum> findAllByCategoriaContainingIgnoreCase(String categoria);

}
}
