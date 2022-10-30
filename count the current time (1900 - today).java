package com.company;

import java.util.Date;

public class cwh_97_Date {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println("Return Time");
        System.out.println(d.getTime());
        System.out.println("Return Date");
        System.out.println(d.getDate());
        System.out.println("Return Seconds");
        System.out.println(d.getSeconds());
        //starting tieme 1900 year
        System.out.println("Return year");
        System.out.println(d.getYear());
        System.out.println("Return Minutes");
        System.out.println(d.getMinutes());
    }
}
