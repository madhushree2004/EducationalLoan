package com.example.Educationloan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Educationloan.Model.LoanApplicationModel;
import com.example.Educationloan.Model.UserModel;
import com.example.Educationloan.Service.eduloanService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class eduloanController 
{

	@Autowired eduloanService us;
		
	@Tag(name="Get",description="get data")
	@GetMapping("/getalluser")
	public List<UserModel> allDetails()
	{
		return us.getAllDetails();
	}
		
	@GetMapping("/loginbyusername")
	public String logins(@RequestParam String username, @RequestParam String password)
	{
		return us.login(username,password);
	}
	
	@Tag(name="Post",description="post data")
	@PostMapping("/saveuser")
	public UserModel regid(@RequestBody UserModel id) 
	{
		return us.register(id);
	}
		
	@PutMapping("/updateuser")
	public UserModel saveAlll(@RequestBody UserModel id) 
	{
		return us.putDetails(id);
	}
	
	@GetMapping("/getalluser/{id}")
	public UserModel getId(@PathVariable int id) 
	{	
		return us.getDetailsById(id);
	}
		
	@DeleteMapping("/deletebyuser/{id}")
	public String delete(@PathVariable int id) 
	{
		us.deleteById(id);
		return "Details Deleted";
	}
	
	@GetMapping("/getallloan")
	public List<LoanApplicationModel> alDetails()
	{	
		return us.getAlDetails();
	}
	
	@PostMapping("/saveloan")
	public LoanApplicationModel addloan(@RequestBody LoanApplicationModel id)
	{	
		return us.add(id);
	}
	
	@PutMapping("/updateloan")
	public LoanApplicationModel savemethod(@RequestBody LoanApplicationModel id) 
	{
		return us.put(id);	
	}
	
	@GetMapping("/getallloan/{id}")
	public LoanApplicationModel getsId(@PathVariable int id) 
	{	
		return us.getDetailById(id);
	}
	
	@DeleteMapping("/deletebyloan/{id}")
	public String deleted(@PathVariable int id) 
	{
		us.deleteId(id);
		return "Details Deleted";
	}
	
}


