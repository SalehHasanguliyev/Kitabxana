package az.kitab.Kitabxana.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.kitab.Kitabxana.request.LibrarianAddRequest;
import az.kitab.Kitabxana.service.LibrarianService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/librarians")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor

public class LibrarianRestController {
	
	private final LibrarianService service;
	
	@PostMapping
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_LIBRARIAN')")
	public ResponseEntity<String> create(@Valid @RequestBody LibrarianAddRequest lar){
		
		return service.create(lar);
	}

}
