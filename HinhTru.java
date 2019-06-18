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
public class HinhTru extends hinhtron{
     public float chieuCao;
 
    // Constructor
    public HinhTru() {
        ten = "Hình Trụ";
    }
 
    public void nhapChieuCao() {
        nhapBanKinh();
 
        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
 
    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
