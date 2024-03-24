package az.kitab.Kitabxana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")

@Data
@Builder
@Getter
@Setter

public class User {
	
	@Id
	private String username;
	
	private String password;

}
