/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import java.util.*;
/**
 *
 * @author vovan
 */
public class switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter: ");
        String i = scanner.nextLine();
        String monthString;
        switch (i) {
            case "1":  monthString = "January";
                     break;
            case "2":  monthString = "February";
                     break;
            case"3":  monthString = "March";
                     break;
            case "4":  monthString = "April";
                     break;
            case "5":  monthString = "May";
                     break;
            case "6":  monthString = "June";
                     break;
            case "7":  monthString = "July";
                     break;
            case "8":  monthString = "August";
                     break;
            case "9":  monthString = "September";
                     break;
            case "10": monthString = "October";
                     break;
            case "11": monthString = "November";
                     break;
            case "12": monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
        }
    }
