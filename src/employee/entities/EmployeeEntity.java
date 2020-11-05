package employee.entities;

/**
 * Created by vipul.k on 11/5/20.
 */
public class EmployeeEntity {
    int id;
    EmployeeType employeeType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}

