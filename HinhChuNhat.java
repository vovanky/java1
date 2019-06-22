package interface1;

public  class HinhChuNhat implements HinhHoc {
	public double chieudai,chieurong;
	public HinhChuNhat(double d, double e){
		this.chieudai= d;
		this.chieurong= e;
	}
	public double dt(){
		return chieudai*chieurong;
	}
	public double cv() {
		// TODO Auto-generated method stub
		return 2*(chieudai+chieurong);
	}
	public void println() {
		System.out.println( "dien tich hinh chu nhat: "+ dt());
		System.out.println( "chu vi hinh chu nhat: "+ cv());
	}
}
