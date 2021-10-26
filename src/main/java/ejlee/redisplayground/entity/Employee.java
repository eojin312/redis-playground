package ejlee.redisplayground.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empNo;

    @Column
    private String eName;

    @Column
    private String job;

    @Column
    private String mgr;

    @Column
    private LocalDateTime hireDate;

    @Column
    private int sal;

    @Column
    private int comm;

    @Column
    private int deptNo;
}
