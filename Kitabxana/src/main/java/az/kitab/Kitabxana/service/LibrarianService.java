package az.kitab.Kitabxana.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import az.kitab.Kitabxana.entity.Librarian;
import az.kitab.Kitabxana.entity.User;
import az.kitab.Kitabxana.repository.LibrarianRepository;
import az.kitab.Kitabxana.repository.UserRepository;
import az.kitab.Kitabxana.request.LibrarianAddRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class LibrarianService {
	
	private final ModelMapper mapper;
	
	private final LibrarianRepository repository;
	
	private final UserRepository userRepository;

	public ResponseEntity<String> create(LibrarianAddRequest lar) {
		
		Librarian librarian = new Librarian();
		mapper.map(lar, librarian);
		repository.save(librarian);
		
		User user = new User();
		mapper.map(librarian, user);
		user.setEnabled(true);
		user.setType("librarian");
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String raw = lar.getPassword();
		String password = encoder.encode(raw);
		user.setPassword(password);
		
		userRepository.save(user);
		
		return ResponseEntity.ok("Uğurlu əməliyyat");
		
	}
	
	

}
