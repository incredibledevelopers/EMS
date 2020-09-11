package in.co.cognizant.ems.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.cognizant.ems.model.EmployeeDailyActivity;
import in.co.cognizant.ems.repository.EmployeeDailyActivityRepository;

@RestController
@RequestMapping("/ems/employeeDailyActivity")
public class EmployeeDailyActivityController {
	@Autowired
	private EmployeeDailyActivityRepository employeeDailyActivityRepository;

	@GetMapping("/activities")
	public List<EmployeeDailyActivity> getAllActivities() {
		return employeeDailyActivityRepository.findAll();
	}

	@PostMapping("/activities")
	public EmployeeDailyActivity createEmployee(@Valid @RequestBody EmployeeDailyActivity employeeDailyActivity) {
		return employeeDailyActivityRepository.save(employeeDailyActivity);
	}
}