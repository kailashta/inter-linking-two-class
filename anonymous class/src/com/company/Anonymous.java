package com.company;

public class Anonymous {

       Birth  birth = new Birth(){
            public void display(String dob){
                System.out.println("Date of Birth : "+dob );
            }

        };
}
