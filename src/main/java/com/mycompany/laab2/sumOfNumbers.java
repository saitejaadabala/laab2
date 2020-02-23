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
public class sumOfNumbers {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int inputNumber = 0;
        int sum         = 0;
        System.out.println("Enter Positive non zero value");
        inputNumber = scn.nextInt();
        
        for(int i =0;i<=inputNumber;i++){
            sum +=i;
        }
        
        if(inputNumber <= 0){
            System.out.println("Enter value greater than 0");
        }
        
        System.out.println("The Sum of number from 1 to "+inputNumber+" is "+sum);
        
    }
}
