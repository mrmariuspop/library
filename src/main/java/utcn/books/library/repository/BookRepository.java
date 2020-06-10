package utcn.books.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.books.library.model.Book;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {

}
