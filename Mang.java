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
public class Mang {
    public static void main(String[] args){
    
        int sodong, socot;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nhap vao so dong: ");
        sodong = scanner.nextInt();
        System.out.println("nhap vao so cot: ");
        socot = scanner.nextInt();
        
        int[][] A = new int[sodong][socot];
        for(int i=0 ; i<sodong; i++){
            for(int j = 0; j < socot; j++){
            System.out.println("nhap phan tu thu[" + i + "," + j + "]:");
            A[i][j]= scanner.nextInt();
            }}
            System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < sodong; i++) {
        for (int j = 0; j < socot; j++) {
            System.out.print(A[i][j] + "\t");
        }
        }
        System.out.println("\n");  
        
    }
    
}
