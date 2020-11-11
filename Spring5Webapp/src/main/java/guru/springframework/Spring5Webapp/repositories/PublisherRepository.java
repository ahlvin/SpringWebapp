package guru.springframework.Spring5Webapp.repositories;

import guru.springframework.Spring5Webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
