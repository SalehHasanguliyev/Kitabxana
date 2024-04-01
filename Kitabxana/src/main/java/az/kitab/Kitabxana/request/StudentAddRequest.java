package az.kitab.Kitabxana.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class StudentAddRequest {
	
	@NotEmpty(message = "Boş qoymaq olmaz")
	@Size(min = 2, message = "Minimum 2 simvol yazmaq lazımdır")
	@Size(min = 30, message = "Maksimum 30 simvol yazmaq lazımdır")
	private String name;

	@NotEmpty(message = "Boş qoymaq olmaz")
	@Size(min = 2, message = "Minimum 2 simvol yazmaq lazımdır")
	@Size(min = 30, message = "Maksimum 30 simvol yazmaq lazımdır")
	private String surname;
	
	@NotEmpty(message = "Boş qoymaq olmaz")
	@Size(min = 2, message = "Minimum 2 simvol yazmaq lazımdır")
	@Size(min = 30, message = "Maksimum 30 simvol yazmaq lazımdır")
	private String username;
	
	@NotEmpty(message = "Boş qoymaq olmaz")
	@Size(min = 2, message = "Minimum 2 simvol yazmaq lazımdır")
	@Size(min = 30, message = "Maksimum 30 simvol yazmaq lazımdır")
	private String password;

}
