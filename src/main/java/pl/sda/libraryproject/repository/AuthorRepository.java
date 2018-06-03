package pl.sda.libraryproject.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.libraryproject.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long>{
}
