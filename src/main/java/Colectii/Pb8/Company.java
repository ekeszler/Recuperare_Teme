package Colectii.Pb8;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<String> employeeList;

    public Company(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> filterByAgeGreatherThan (int age){
        List<Employee> result = new ArrayList<>();
        for (Employee employee: employeeList){
            if(employee.getAge() > age){
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> employeesFromRomania (String country){
        List<Employee> result = new ArrayList<>();
        for (Employee employee: employeeList){
            if(employee.getCountry().equals(country)){
                result.add(employee);
            }
        }
        return result;
    }
}
