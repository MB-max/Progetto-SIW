package it.uniroma3.siw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Tag;
import it.uniroma3.siw.model.Task;

public interface TagRepository extends CrudRepository<Tag, Long> {
	
	//Riporta una lista di tutti i Tag associati a quel Task
	public List<Tag> findTagAssociati(Task task);

}
