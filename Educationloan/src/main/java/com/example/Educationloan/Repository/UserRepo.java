package com.example.Educationloan.Repository;



	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Educationloan.Model.UserModel;



	@Repository
	public interface UserRepo extends JpaRepository<UserModel,Integer> {

	}


