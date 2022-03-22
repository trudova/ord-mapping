package com.liv.bootstrap;

import com.liv.entity.Department;
import com.liv.entity.Employee;
import com.liv.entity.Region;
import com.liv.enums.Gender;
import com.liv.repository.DepartmentRepository;
import com.liv.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;
//    @Autowired
//    DepartmentRepository departmentRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.now().minusDays(60), Gender.FEMALE, 12134);
        Employee employee2 = new Employee("Liv", "true", "bmanueau0@dion.ne.jp", LocalDate.now().minusDays(60), Gender.FEMALE, 23333);
        Employee employee3 = new Employee("Vika", "Morgan", "bmanueau0@dion.ne.jp", LocalDate.now().minusDays(60), Gender.MALE, 13234);
        Employee employee4 = new Employee("Kate", "Klabs", "bmanueau0@dion.ne.jp", LocalDate.now().minusDays(60), Gender.FEMALE, 12304);
        Employee employee5 = new Employee("Russ", "Koval", "bmanueau0@dion.ne.jp", LocalDate.now().minusDays(60), Gender.MALE, 120034);


        Department department1 = new Department("Automotive", "Hardware");
        Department department2 = new Department("Vitamins", "Health");
        Department department3 = new Department("Sports", "Outdoors");
        Department department4 = new Department("Grocery", "Home");
        Department department5 = new Department("Computers", "Electronics");
        Region region1 = new Region("Southwest", "United States");
        Region region2 = new Region("Northeast", "United States");
        Region region3 = new Region("Central", "Asia");
        Region region4 = new Region("East Asia", "Asia");
        Region region5 = new Region("Quebec", "Canada");
        employee1.setRegion(region1);
        employee2.setRegion(region2);
        employee3.setRegion(region3);
        employee4.setRegion(region4);
        employee5.setRegion(region5);

        employee1.setDepartment(department1);
        employee2.setDepartment(department1);
        employee3.setDepartment(department1);
        employee4.setDepartment(department4);
        employee5.setDepartment(department5);
        employeeRepository.saveAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
        employeeRepository.deleteById(1);

//        List<Department> departments = new ArrayList<>(Arrays.asList(department1,department2,department3,department4,department5));
//        departmentRepository.saveAll(departments);

    }
}
