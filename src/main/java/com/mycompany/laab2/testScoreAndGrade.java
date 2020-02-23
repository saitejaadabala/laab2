/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laab2;

import java.util.Scanner;

/**
 *
 * @author adaba
 */
public class testScoreAndGrade {
    public static void main(String[] args) {
        
        double score1;
        double score2;
        double score3;
        double average;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter 1st score");
        score1 = scn.nextDouble();
        
        System.out.println("Enter 2nd score");
        score2 = scn.nextDouble();
        
        System.out.println("Enter 3rd score");
        score3 = scn.nextDouble();
        
        average = (score1 + score2 + score3)/3;
        
        System.out.println("Average is = "+average);
        
        String grade = "";
        if(average < 60){
            grade = "F";
        }else if(average < 70){
            grade ="D";
        }else if(average < 80){
            grade ="C";
        }else if(average < 90){
            grade ="B";
        }else if(average <= 100){
            grade ="A";
        }else{
            System.out.println("Invalid Average");
            grade = "Invalid GRADE";
        }
        System.out.println("Grade is  = "+grade);
        
    }
}
