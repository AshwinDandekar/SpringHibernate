package net.rage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.rage.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService sserv;
	
	@RequestMapping("/manageStud")
	public String studentManagementPage(ModelMap map){
		return "manageStud";
	}
}
