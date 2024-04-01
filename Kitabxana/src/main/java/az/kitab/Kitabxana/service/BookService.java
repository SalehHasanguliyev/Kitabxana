package az.kitab.Kitabxana.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import az.kitab.Kitabxana.entity.Book;
import az.kitab.Kitabxana.repository.BookRepository;
import az.kitab.Kitabxana.request.BookAddRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class BookService {
	
	private final ModelMapper mapper;
	private final BookRepository repository;

	public void add(BookAddRequest bar) {
		
		Book book = new Book();
		mapper.map(bar, book);
		repository.save(book);
		
		
		
	}
	
	

}
