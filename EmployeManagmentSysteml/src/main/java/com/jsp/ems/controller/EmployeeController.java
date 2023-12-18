package com.jsp.ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.ems.configuration.ConfigurationClass;
import com.jsp.ems.dao.EmployeeDao;
import com.jsp.ems.entity.Employee;
import com.jsp.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;
	
	@RequestMapping("save")
	public ModelAndView saveEmployee(ModelAndView mav, Employee employee) {
		mav.addObject("employee", employee) ;
		mav.setViewName("createemployee.jsp");
		return mav ;
	}
	
	@RequestMapping(value = "saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployeeToDb(@ModelAttribute Employee employee,ModelAndView mav ) {
		employeeService.saveEmployee(employee) ;
		mav.setViewName("index.jsp");
		return mav ;
	}
	
	@RequestMapping("find")
	public ModelAndView findEmployee(ModelAndView mav) {
		mav.setViewName("findemployee.jsp");
		return mav ; 
	}
	
	@RequestMapping(value = "findemployee", method = RequestMethod.POST)
	public ModelAndView displyFindEmployee(HttpServletRequest request, ModelAndView mav) {
		int id = Integer.parseInt(request.getParameter("id")) ;
		Employee employee = employeeService.findEmployee(id) ;
		
		if(employee != null) {
		mav.addObject("employee", employee) ;
		mav.setViewName("displayemployee.jsp");
		return mav ;
		}else {
			mav.addObject("msg", "Eee object illa kano looo") ;
			mav.setViewName("index.jsp");
			return mav ;
		}
	}
	
	@RequestMapping("update")
	public ModelAndView updateEmployee(ModelAndView mav) {
		mav.setViewName("updateemp.jsp");
		return mav ;
	}
	
	@RequestMapping(value = "updateployee")
	public ModelAndView updateEmpDetails(HttpServletRequest request,ModelAndView mav) {
		
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		Employee emp = employeeService.findEmployee(id) ;
		
		if(emp!= null) {
		
		mav.addObject("employee", emp) ;
		
		mav.setViewName("displayUpdatingemp.jsp");
		
		return mav ;
		}else {
			mav.addObject("msg", "Eee object Upadte madake object nim appa kodtana") ;
			mav.setViewName("index.jsp");
			return mav ;
		}
		
		
		
	}
	
	@RequestMapping(value = "saveupdate", method = RequestMethod.POST)
	public ModelAndView saveUpdatedEmployee(@ModelAttribute Employee employee, ModelAndView mav) {
		
		employeeService.updateEmployee(employee) ;
		mav.addObject("msg", "Updated successfully...!") ;
		mav.setViewName("index.jsp");
		return mav ;
		
	}
	
	@RequestMapping(value = "delete")
	public ModelAndView deleteEmploye(ModelAndView mav) {
		
		mav.setViewName("delete.jsp");
		return mav ;
	}
	
	@RequestMapping(value = "deleteemployee")
	public ModelAndView removeEmployee(HttpServletRequest request,ModelAndView mav) {
		
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		Employee emp = employeeService.findEmployee(id) ;
		
		if(emp != null) {
		employeeService.deleteEmployee(id) ;
		mav.addObject("msg", "Deleted successfully...!") ;
		mav.setViewName("index.jsp");
		return mav ;
		}else {
			mav.addObject("msg", "Employee does not exits please check the Id") ;
			mav.setViewName("index.jsp");
			return mav ;
		}
				
	}
	
	/*
	 * @RequestMapping(value = "findall") public ModelAndView
	 * findAllEmployee(ModelAndView mav) { List<Employee> list =
	 * employeeService.findAllEmployee() ; mav.addObject("employess", list) ;
	 * 
	 * mav.setViewName("displayAllEmployee.jsp"); return mav ; }
	 */
	
}
