package it.cuccurese.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
	@Bean
	CommandLineRunner commandLineRunner(
			StudentRepository studentRepository) {
		return args -> {
			Student roberto = new Student("Roberto", "roberto.cuccurese@gmail.com", LocalDate.of(1983, Month.JULY, 22));
			Student alessandro = new Student("Alessandro", "alessandro.cuccurese@gmail.com", LocalDate.of(1980, Month.MAY, 10));
			Student loredana = new Student("Loredana", "loredana.cuccurese@gmail.com", LocalDate.of(1977, Month.NOVEMBER, 20));
			studentRepository.saveAll(List.of(roberto, alessandro, loredana));
		};
	}
}
