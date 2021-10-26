package ejlee.redisplayground.runner;

import ejlee.redisplayground.entity.Employee;
import ejlee.redisplayground.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class DefaultData implements ApplicationRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Employee employee = Employee.builder()
                .comm(1)
                .mgr("dd")
                .sal(3)
                .job("33")
                .hireDate(LocalDateTime.MAX)
                .eName("hj")
                .deptNo(1)
                .build();

        employeeRepository.save(employee);

        employeeRepository.findAll().forEach(e -> {
            log.info("레디스 테스트 : {}", e);
        });
    }
}
