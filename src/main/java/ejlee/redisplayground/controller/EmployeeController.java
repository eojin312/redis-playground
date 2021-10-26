package ejlee.redisplayground.controller;

import ejlee.redisplayground.entity.Employee;
import ejlee.redisplayground.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/emp")
    public List<Employee> getEmployee() {
        return employeeService.findAllEmployee();
    }
}
