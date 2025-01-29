package org.dnyanyog.controller;

import org.dnyanyog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/first_name/{roll_no}")
	public String getName(@PathVariable int roll_no) {
		return new StudentService().getFirstName(roll_no);
	}
	
	@GetMapping("/last_name/{roll_no}")
	public String getPassword(@PathVariable int roll_no)
	{
		return new StudentService().getLastName(roll_no);
	}
	
	@GetMapping("/email_id/{roll_no}")
	public String getEmail(@PathVariable int roll_no)
	{
		return new StudentService().getEmail(roll_no);
	}

}
