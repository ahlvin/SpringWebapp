package guru.springframework.Spring5Webapp.repositories;

import guru.springframework.Spring5Webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author,Long> {
}
