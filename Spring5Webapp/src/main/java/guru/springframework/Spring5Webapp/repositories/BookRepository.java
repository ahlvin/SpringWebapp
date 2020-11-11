package guru.springframework.Spring5Webapp.repositories;

import guru.springframework.Spring5Webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
