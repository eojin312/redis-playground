package ejlee.redisplayground.repository;

import ejlee.redisplayground.entity.Employee;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableRedisRepositories
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
