package ejlee.redisplayground.service;

import ejlee.redisplayground.entity.Employee;
import ejlee.redisplayground.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Iterable<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        Employee save = employeeRepository.save(employee);
        return save;
    }
}
