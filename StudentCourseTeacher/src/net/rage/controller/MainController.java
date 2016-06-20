package net.rage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import net.rage.service.TeacherService;
import net.rage.service.StudentService;
import net.rage.service.CourseService;


@Controller
@RequestMapping({"","/"})
public class MainController {
	
	@Autowired
	public TeacherService tserv;
	@Autowired
	public StudentService sserv;
	@Autowired
	public CourseService cserv;

	@RequestMapping("login")
	public String returnLoginPage() {
		return "login";
	}
	
	@RequestMapping("mainpage")
	public String returnMainPage(@RequestParam String user, ModelMap model, HttpServletResponse response, HttpServletRequest request) throws Exception {
		if("rage".equals(user)){
			model.addAttribute("TeachList",tserv.findAllTeachers());
			model.addAttribute("StudList",sserv.findAllStudents());
			model.addAttribute("CourseList",cserv.getCourses());
			return "mainpage";
		}
		if("user".equals(user)){
			request.getRequestDispatcher("/StudentCourseTeacher/studmainpage").forward(request, response);
			return "";
		}
		if("noob".equals(user)){
			request.getRequestDispatcher("/StudentCourseTeacher/teachmainpage").forward(request, response);
			return "";
		}
		else {
		return "noprofpage";
		}
	}
	
	@RequestMapping("logout")
	public String returnLogoutPage(){
		return "logout";
	}
}
