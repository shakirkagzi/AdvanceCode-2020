package design.pattern.vo;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int rollNo;
    private String address;

    public Student(){

    }
    public Student(String name,int rollNo,String address){
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
