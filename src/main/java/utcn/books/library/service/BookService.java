package utcn.books.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utcn.books.library.model.Book;
import utcn.books.library.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book bookToBeSaved) {
        return bookRepository.save(bookToBeSaved);
    }
}
