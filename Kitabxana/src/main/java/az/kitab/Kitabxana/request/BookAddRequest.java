package az.kitab.Kitabxana.request;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class BookAddRequest {
	
	@Size(min = 3, max = 50, message = "Ad minimum 3 maksimum 50 rəqəm olmalıdır")
	@NotNull(message = "Kitabın adı mütləqdir")
	private String name;
	
	@Min(value = 0, message = " Minimum 0 yazmaq olar")
	@Max(value = 1000, message = " Maksimum 1000 yazmaq olar")
	@NotNull(message = "Boş qoymaq olmaz")
	private Double price;
	
	@NotNull(message = "Kitabın dərc olunma tarixi qeyd edilməlidir")
	private LocalDate publishDate;

}
