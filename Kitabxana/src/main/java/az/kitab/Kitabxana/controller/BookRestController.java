package az.kitab.Kitabxana.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.kitab.Kitabxana.request.BookAddRequest;
import az.kitab.Kitabxana.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/books")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor

public class BookRestController {
	
	private final BookService service;
	
	@PostMapping(path = "/add-book")
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_BOOK')")
	public ResponseEntity<String> add(@Valid @RequestBody BookAddRequest bar) {
		
		service.add(bar);
		
		return ResponseEntity.ok("Kitab uğurla əlavə edildi");
	}

}
