package sef.activity1;

public class ActivityOne {
    public static void main(String[] args) {
        Person michael = new Person();
        michael.setFirstName("michael");
        michael.setAge(25);

        Student Vita = new Student();
        Vita.setSchoolName("RTU");


        Employee Arnold = new Employee();
        Arnold.setName("Arnold");
        Arnold.setCompany("Latvenergo");
        Arnold.setJobTitle("accountant");
        Arnold.setAge(37);


        Vita.introduce();
        michael.introduce();
        Arnold.introduce();

    }
}
