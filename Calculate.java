package class1;

public class Calculate {
	protected int c;
    public void phepCong(int a, int b) {
        c = a + b;
        System.out.println("Tổng hai số = " + c);
    }
     
    public void phepTru(int a, int b) {
        c = a - b;
        System.out.println("Hiệu hai số = " + c);
    }
}
