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
public class mangmotchieu {
    
    public static void main(String[] args){
    int A, sum=0 , number;
    float average;
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao so phan tu cua mang: ");
    A = scanner.nextInt();
    int[] mang = new int[A];
    
    for(int i=0; i< A; i++){
    System.out.println("nhap vao phan tu thu " +i+": ");
    mang[i] = number = scanner.nextInt();     
    sum += number;
    }
    for(int i=0; i<A; i++){
    System.out.println("phan tu thu" + i +": " +mang[i]);
    }


    average = (float)sum/A;
    System.out.println("Trung Bình Cộng: " + average);
    }
}
