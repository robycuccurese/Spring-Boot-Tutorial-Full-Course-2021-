package it.cuccurese.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List
				.of(new Student(1L, "Roberto", "roberto.cuccurese@gmail.com", LocalDate.of(1983, Month.JULY, 22), 38));
	}
}