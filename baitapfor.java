/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import java.util.Scanner;
/**
 *
 * @author vovan
 */
public class baitapfor {
    public static void main(String[] args) {
 
        // Khai báo một biến
        int a = 0;
 
        // Khai báo một biến 'i'
        // Gán giá trị ban đầu 1
        // Sau mỗi bước lặp giá trị của nó tăng lên 1.
        // Chú ý: i++ tương đương với câu lệnh: i = i + 1;
        // i-- tương đương với câu lệnh: i = i - 1;
        for (int i = 1; i <= 100; i++) {
 
            // Gán giá trị 'a' bằng giá trị cũ cộng thêm 'i'.
            a= a + i;
        }
 
        System.out.println("Total = " + a);
 
    }
	}
