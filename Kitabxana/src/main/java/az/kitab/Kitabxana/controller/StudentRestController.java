package az.kitab.Kitabxana.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.kitab.Kitabxana.request.StudentAddRequest;
import az.kitab.Kitabxana.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/students")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor

public class StudentRestController {
	
private final StudentService service;
	
	@PostMapping
    @PreAuthorize(value = "hasAuthority('ROLE_ADD_STUDENT')")
	public ResponseEntity<String> create(@Valid @RequestBody StudentAddRequest sar,BindingResult br){
		
		return service.create(sar,br);
	}

}
