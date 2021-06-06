package sef.activity1;

public class Student {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {
        System.out.println("I study in university " + schoolName);
    }
}
