package it.cuccurese.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	public void addNewStudent(Student student) {
		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
		if (!studentOptional.isEmpty()) {
			throw new IllegalStateException("email taken");
		}
		studentRepository.save(student);
	}
}