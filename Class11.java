package j11;
interface Data{
	public void showData();
}
interface Test{
	public void showScore();
	public double calcu();
}
class CStu implements Data,Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	public CStu(String s1,String s2,int m,int f,int c) {  //建構元
		this.id=s1;
		this.mid=m;		
	    this.name=s2;
	    this.finl=f;
	    this.common=c;
	}
	//showData()
	public void showData() {
		System.out.println("學號:"+id);
		System.out.println("姓名:"+name);
	}
	//showScore()
	public void showScore() {
		System.out.println("期中考成績:"+mid);
		System.out.println("期末考成績:"+finl);
		System.out.println("平時考成績:"+common);
		System.out.println("學期:"+calcu());
	}
	public double calcu() {
		return (mid*.3+finl*.3+common*.4);
	}
	public void show() {
		showData();
		showScore();
	}
}
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();

	}

}
