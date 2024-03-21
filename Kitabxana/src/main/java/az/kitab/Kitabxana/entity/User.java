package az.kitab.Kitabxana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")

@Getter
@Setter

public class User {
	
	@Id
	private String username;
	
	private String password;

}