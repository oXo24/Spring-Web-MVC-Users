package org.example.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.app.entity.Employee;
import org.example.app.service.ext.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/employees")
    public String viewEmployees(Model model) {
        List<Employee> employees = service.fetchAll();
        model.addAttribute("title", "Employees");
        model.addAttribute("employee", employees);
        return "employees";
    }

    @RequestMapping("/add-employee")
    public String addEmployee(Model model) {
        model.addAttribute("title", "Add Employee");
        return "employee_add";
    }

    @RequestMapping(value = "/handle-employee", method = RequestMethod.POST)
    public RedirectView handleEmployee(@ModelAttribute Employee employee, HttpServletRequest request) {
        service.save(employee);
        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl(request.getContextPath() + "/employees");
        redirectView.setUrl("./employees");
        return redirectView;
    }

    @RequestMapping("/update-employee/{id}")
    public String updateEmployee(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title","Update Employee");
        Employee employee = service.fetchById(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    @RequestMapping("/delete-employee/{id}")
    public RedirectView deleteEmployee(@PathVariable("id") Long id, HttpServletRequest request) {
        service.delete(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/employees");
        return redirectView;
    }

}
