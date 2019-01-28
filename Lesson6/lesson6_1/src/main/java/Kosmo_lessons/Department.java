package Kosmo_lessons;

import java.util.List;

public class Department {

    protected String departmentName;
    protected Employee headOfDepartment;
    protected List<Employee> employees;
    protected List<Department> departments;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Employee headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public void addSubDep(Department subDep){
        this.departments.add(subDep);
    }
}
