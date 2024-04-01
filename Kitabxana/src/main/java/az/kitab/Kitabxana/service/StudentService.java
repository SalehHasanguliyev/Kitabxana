package az.kitab.Kitabxana.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import az.kitab.Kitabxana.entity.Librarian;
import az.kitab.Kitabxana.entity.Student;
import az.kitab.Kitabxana.entity.User;
import az.kitab.Kitabxana.repository.LibrarianRepository;
import az.kitab.Kitabxana.repository.StudentRepository;
import az.kitab.Kitabxana.repository.UserRepository;
import az.kitab.Kitabxana.request.LibrarianAddRequest;
import az.kitab.Kitabxana.request.StudentAddRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class StudentService {
	
	private final ModelMapper mapper;
	
	private final StudentRepository repository;
	
	private final UserRepository userRepository;

	public ResponseEntity<String> create(@Valid StudentAddRequest sar,BindingResult br) {


		
		Student student = new Student();
		mapper.map(sar, student);
		repository.save(student);
		
		User user = new User();
		mapper.map(student, user);
		user.setEnabled(true);
		user.setType("student");
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String raw = sar.getPassword();
		String password = encoder.encode(raw);
		user.setPassword(password);
		
		userRepository.save(user);
		
		return ResponseEntity.ok("Uğurlu əməliyyat");
		
	}
	
	

}