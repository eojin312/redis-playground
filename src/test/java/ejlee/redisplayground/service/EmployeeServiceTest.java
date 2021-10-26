package ejlee.redisplayground.service;

import ejlee.redisplayground.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void findAllEmployee() {
        System.out.println(employeeService.findAllEmployee());
    }

    @Test
    public void save () {
        // given
        Employee employee = Employee.builder()
                .comm(1)
                .deptNo(1)
                .eName("ej")
                .hireDate(LocalDateTime.now())
                .job("back")
                .sal(1)
                .mgr("thanks")
                .comm(1)
                .build();
        // when
        Employee saveEmployee = employeeService.saveEmployee(employee);

        // then
        Assertions.assertNotNull(saveEmployee);
    }
}
