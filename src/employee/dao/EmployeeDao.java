package employee.dao;

import employee.entities.EmployeeEntity;
import employee.entities.EmployeeType;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    List<EmployeeEntity> getEmployeeByType(EmployeeType type);
    Optional<EmployeeEntity> getEmployee(int id);
}
