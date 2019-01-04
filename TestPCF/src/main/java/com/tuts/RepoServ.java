package com.tuts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tuts.bean.Student;

@Repository
public interface RepoServ extends JpaRepository<Student, String>{

	@Query("from Student where s_class=:s_class")
	
	public List<Student> getClassWiseRecords(@Param("s_class") int s_class);
}
