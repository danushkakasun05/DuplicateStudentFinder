package com.DuplicateFinder;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    private String school;
    public Student (String name,int age,String school){
        this.name= name;
        this.age = age;
        this.school=school;

    }

}
