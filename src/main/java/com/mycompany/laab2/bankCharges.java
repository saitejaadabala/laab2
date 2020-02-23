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
public class bankCharges {
    public static void main(String[] args) {
        
        double checksRequired =  0;
        double baseFee        = 10;
        double checkFee       =  0;
        double bankServiceFee =  0;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Number of checks required for a month");
        
        
        checksRequired =  scn.nextInt();
        
        if(checksRequired < 20){
            bankServiceFee = baseFee+(checksRequired * 0.10);
        }else if(checksRequired < 40 ){
            bankServiceFee = baseFee+(checksRequired * 0.08);
        }else if(checksRequired < 60){
            bankServiceFee = baseFee+(checksRequired * 0.06);
        }else{
            bankServiceFee = baseFee+(checksRequired * 0.04);
        }
        
        System.out.println("Service Fee = "+bankServiceFee);
    }
}
