package employee.dao;

import employee.entities.EmployeeEntity;
import employee.entities.EmployeeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by vipul.k on 11/5/20.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private List<EmployeeEntity> entities = new ArrayList<>();

    @Override
    public List<EmployeeEntity> getEmployeeByType(EmployeeType type) {
        return entities.stream()
                .filter(e -> e.getEmployeeType().equals(type))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EmployeeEntity> getEmployee(int id) {
        return entities.stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }
}
