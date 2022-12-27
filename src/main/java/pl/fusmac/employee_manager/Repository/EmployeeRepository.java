package pl.fusmac.employee_manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fusmac.employee_manager.Model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
