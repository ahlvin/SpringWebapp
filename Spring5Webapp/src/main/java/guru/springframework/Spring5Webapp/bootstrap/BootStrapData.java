package guru.springframework.Spring5Webapp.bootstrap;

import guru.springframework.Spring5Webapp.domain.Author;
import guru.springframework.Spring5Webapp.domain.Book;
import guru.springframework.Spring5Webapp.domain.Publisher;
import guru.springframework.Spring5Webapp.repositories.AuthorRepository;
import guru.springframework.Spring5Webapp.repositories.BookRepository;
import guru.springframework.Spring5Webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1918828");
        Publisher publisher = new Publisher("Rooks", "Add 1", "Miami", "FL", "43221");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("numbers of books " + bookRepository.count());
        System.out.println("Publisher count "+ publisherRepository.count());



    }
}
