package com.example.Educationloan.Repository;
	
	
	

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.Educationloan.Model.LoginModel;

	

	@Repository
	public interface LoginRepo extends JpaRepository <LoginModel,String>{

	}


