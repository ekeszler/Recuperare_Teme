package Colectii.Pb8;

import java.util.*;

public class Company {

    private List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> filterByAgeGreatherThan (int age){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList){
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

    public void sortByName(){
        Collections.sort(employeeList);
    }

    public void sortByCountry(){
        employeeList.sort(new CountryComparator());
    }

    public Map<String, Integer> getNumberOfEmoployeesByCountry(){
        Map<String, Integer> numberOfEmployeesByCountry= new HashMap<>();
        for(Employee employee : employeeList){
            if(numberOfEmployeesByCountry.containsKey(employee.getCountry())){
                numberOfEmployeesByCountry.put(employee.getCountry(), numberOfEmployeesByCountry.get(employee.getCountry())+1);
            }else{
                numberOfEmployeesByCountry.put(employee.getCountry(), 1);
            }
        }
        return numberOfEmployeesByCountry;
    }

    public Map<String, List<Employee>> getEmployeesByCountry(){
        Map<String, List<Employee>> employeesByCountry = new HashMap<>();
         for(Employee employee: employeeList){
             String employeeCountry = employee.getCountry();
             if (employeesByCountry.containsKey(employeeCountry)){
                 employeesByCountry.get(employeeCountry).add(employee);
             }
             else{
                 List<Employee> valueEmployeeList = new ArrayList<>();
                 valueEmployeeList.add(employee);
                 employeesByCountry.put(employeeCountry, valueEmployeeList);
             }
         }
         return employeesByCountry;
    }


}
