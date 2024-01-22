package com.kimsang.crud;

import com.kimsang.crud.dao.StudentDAO;
import com.kimsang.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	// Creating command line application
	// This code will be executed after spring beans have been loaded
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);

//			createMultipleStudents(studentDAO);

			readStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "pau@gmail.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated ID: " + tempStudent.getId());

	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// Create multiple student objects
		System.out.println("Creating new student objects...");
		Student tempStudent1 = new Student("One", "Piece", "onepiece@gmail.com");
		Student tempStudent2 = new Student("John", "Jon", "johnjon@gmail.com");

		// save the student objects
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);

	}

	public void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating new students object...");
		Student  tempStudent = new Student("Kimsang", "Mok", "kimsangmok@gmail.com");

		// save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated ID");

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);
	}
}
