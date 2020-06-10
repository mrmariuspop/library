package utcn.books.library.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utcn.books.library.model.Book;
import utcn.books.library.service.BookService;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("book")
    public Book insertBook(@RequestBody Book bookToBeSaved) {
        return bookService.createBook(bookToBeSaved);
    }
}