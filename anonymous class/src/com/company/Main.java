package com.company;

public class Main extends Anonymous{

    public static void main(String[] args) {
	// write your code here
        Anonymous a1 = new Anonymous();
        MatchingDOB dateObject = new MatchingDOB();
        dateObject.showDob(a1.birth);

    }
}
