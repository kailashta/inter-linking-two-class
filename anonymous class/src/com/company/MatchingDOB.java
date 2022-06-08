package com.company;

import java.util.Scanner;

public class MatchingDOB {
    Scanner sc = new Scanner(System.in);
    public void showDob(Birth b){
        String dob ;
        System.out.println("Enter Your Date Of Birth");
        dob = sc.nextLine();
        b.display(dob);
    }
}
