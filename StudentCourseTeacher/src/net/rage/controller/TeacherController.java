package net.rage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.rage.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	TeacherService tserv;

	@RequestMapping("/manageTeach")
	public String teacherManagement(ModelMap map){
		return "manageTeach";
	}
}
