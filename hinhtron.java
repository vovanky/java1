package kethua;
import java.util.*;

public class hinhtron extends hinhoc{
	 public float banKinh;
 
    // Constructor
    public hinhtron() {
        ten = "Hình Tròn";
    }
 
    public void nhapBanKinh() {
        System.out.println("Bán kính = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }
 
    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }
 
    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
 
}

