/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;
import java.util.*;

/**
 *
 * @author vovan
 */
public class hinhvuong extends hinhchunhat{
    public hinhvuong() {
        ten = "Hình Vuông";
    }
 
    public void nhapCanh() {
        System.out.println("Cạnh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}
