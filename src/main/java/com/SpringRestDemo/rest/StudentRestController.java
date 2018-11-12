package com.SpringRestDemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestDemo.Error.StudentNotFoundException;
import com.SpringRestDemo.entity.Student;
import com.SpringRestDemo.entity.StudentErrorResponse;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	//define a end point for /students
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List theStudents = new ArrayList<Student>();
		theStudents.add(new Student(1,"simplice","Chedjou"));
		theStudents.add(new Student(2,"Okonda","Honore"));
		theStudents.add(new Student(3,"Manuella","Nkoyok"));
		theStudents.add(new Student(4,"Chad","Todd"));
		return theStudents;
		
	}
	
	//define end point for /students/{studentId}
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		Student theStudent = new Student();
		List<Student> theStudents = new ArrayList<Student>();
		theStudents.add(new Student(1,"simplice","Chedjou"));
		theStudents.add(new Student(2,"Okonda","Honore"));
		theStudents.add(new Student(3,"Manuella","Nkoyok"));
		theStudents.add(new Student(4,"Chad","Todd"));
		
		if(studentId<0 || studentId >= theStudents.size()) // student not found
		{
			throw new StudentNotFoundException("student Id not Found "+studentId);
		}
		else // student found
		{
			
			for(Student tempStudent : theStudents)
			{
				if(tempStudent.getId() == studentId)
				{
					theStudent = tempStudent;
				}
			}
		}
		
		return theStudent;
	}
	
	
}
