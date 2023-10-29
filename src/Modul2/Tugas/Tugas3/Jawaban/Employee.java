package Modul2.Tugas.Tugas3.Jawaban;
public class Employee {
    private String employeeName;
    private int employeeAge;
    private double salary;
    private  String jobDescription;

    public Employee (String employeeName, int employeeAge, double salary, String jobDescription){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.salary = salary;
        this.jobDescription = jobDescription;
    }

    public void printEmployeeInfo(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age:" + employeeAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description:" + jobDescription);
    }

    public double calculateAnnualSalary(){
        return salary * 12;
    }

    public void calculateAnnualSalary(double raisePercentage){
        salary +=(salary * raisePercentage/100);
    }
}