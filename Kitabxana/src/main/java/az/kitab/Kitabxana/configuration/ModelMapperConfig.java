package az.kitab.Kitabxana.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


public class ModelMapperConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper obj = new ModelMapper();
		return obj;
	}

}
