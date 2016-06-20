package net.rage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import net.rage.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService cserv;
	
	@RequestMapping("/manageCourse")
	public String viewCourses(ModelMap map) {
		return "manageCourse";
	}
	
}
