package edu.weblab.diandwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Student {

    private int roll;
    private  String sname;
    @Autowired
    private Address addr;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getRoll() {
        return roll;
    }

    public Student() {
        System.out.println("Object has been created");
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public  void show()
    {
        System.out.println("Hello Student!");
        addr.showaddress();
    }


}
