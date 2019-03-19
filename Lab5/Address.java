package edu.weblab.diandwebapp;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String hname;

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public  void showaddress()
    {
        System.out.println("Mir Mosharraf Hossain Hall");
    }

}
