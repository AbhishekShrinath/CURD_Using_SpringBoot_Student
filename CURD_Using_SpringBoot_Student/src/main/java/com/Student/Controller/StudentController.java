package com.Student.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Student.Entities.Student;
import com.Student.Entities.Updatedto;
import com.Student.services.StudentServices;

@Controller
public class StudentController {

	@Autowired
	private StudentServices services;

	@GetMapping("/")
	public String Home() {

		return "Save";
	}

	@GetMapping("/savedata")
	public String Student_Data_Save(@ModelAttribute("SaveData") Student student) {
		services.SaveStudentDetails(student);
		return "Save";
	}

	@GetMapping("/ViewData")
	public String AllStudent_Data_View(ModelMap map) {

		List<Student> allStudents = services.getAllStudents();
		// System.out.println(allStudents);
		map.addAttribute("data", allStudents);
		return "list_of_student";
	}

	@RequestMapping("/delete")
	public String Delete_Student_Data(@RequestParam("id") int id, ModelMap map) {
		try {
			services.StudentDeleteById(id);
			List<Student> findAll = services.getAllStudents();
			map.addAttribute("data", findAll);

			return "list_of_student";
		} catch (Exception e) {
			List<Student> findAll = services.getAllStudents();
			map.addAttribute("data", findAll);

			return "list_of_student";
		}
	}

	@RequestMapping("/update")
	public String Update(@RequestParam("id") int id, ModelMap map) {

		Student studentByID = services.getStudentByID(id);
		// System.out.println(studentByID);

		map.addAttribute("updatedata", studentByID);

		return "update";
	}

	@RequestMapping("/updatedata")
	public String Update_details(@RequestParam("id") int id, Updatedto dto, ModelMap map) {
		Student model = new Student();
		Student studentByID = services.getStudentByID(id);
		// System.out.println(studentByID);

		map.addAttribute("updatedata", studentByID);
		studentByID.setStudent_No(dto.getStudent_No());
		studentByID.setStudent_name(dto.getStudent_name());
		studentByID.setStudent_DOB(dto.getStudent_DOB());
		studentByID.setStudent_DOJ(dto.getStudent_DOJ());
		services.SaveStudentDetails(studentByID);

		List<Student> findAll = services.getAllStudents();
		map.addAttribute("data", findAll);

		return "list_of_student";
	}

	@RequestMapping("/search")
	public String search(@RequestParam("searchid") int id, ModelMap map) {
		// System.out.println(id);
			try {
				Student studentByID = services.getStudentByID(id);

				//System.out.println(studentByID);
				List<Student> list = new ArrayList<>();
				list.add(studentByID);
				map.addAttribute("data", list);

				return "list_of_student";
			} catch (Exception e) {
				map.addAttribute("msg","No Record Found");
				List<Student> findAll = services.getAllStudents();
				map.addAttribute("data", findAll);

				return "list_of_student";
			}

	}

}
