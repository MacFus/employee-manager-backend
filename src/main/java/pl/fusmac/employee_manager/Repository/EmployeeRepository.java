package pl.fusmac.employee_manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fusmac.employee_manager.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
