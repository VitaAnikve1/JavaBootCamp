package sef.activity1;

public class Employee {

    private String name;
    private String jobTitle;
    private String company;
    private int age;
    private double salary;

    public Employee(String name, String jobTitle, String company, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.company = company;
        this.age = age;
    }

    public Employee(String name, String company, double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public Employee() {}

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old. I work as " + jobTitle + " in " + company);
    }
}

