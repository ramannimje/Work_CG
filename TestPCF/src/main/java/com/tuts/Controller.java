package com.tuts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuts.bean.Student;

@RestController
@EntityScan("com.*")
public class Controller {

	@Autowired
	RepoServ repoServ;
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "hello world";
	}
	
	@RequestMapping("/push")
	public String push() {
		Student s=new Student();
		s.setS_class(11);
		s.setS_name("raman");
		repoServ.save(s);
		
		return "data inserted successfully";
	}
}
