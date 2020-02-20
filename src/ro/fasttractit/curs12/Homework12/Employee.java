package ro.fasttractit.curs12.Homework12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee extends Person {
    public final List<String> employee;
    public final String company;
    public final int salary;

    public Employee(String name, int age, String hairColor, List<String> employee, String company, int salary) {
        super(name, age, hairColor);
        this.employee = employee;
        this.company = company;
        this.salary = salary;

    }
   // public int maxSalary(){

  //  }
    public int calcul(){
        int sum= 0;
        sum= sum + salary;
        return sum;
    }
    public Map<List<String>, String> getPers(){
        Map<List<String>, String> result = new HashMap<>();
        result.get(getEmployee());
        return result;
    }

    public Map<List<String>, Integer> getSalar() {
        Map<List<String>, Integer> result = new HashMap<>();
        for (String elem : employee) {
            if (salary > 3000) {
                result.keySet();
            }
        }
        return result;
    }
    public List<String> getEmployee(){
        return employee;
    }
    public String getCompany(){
        return company;
    }
    public int getSalary(){
        return salary;
    }
}
