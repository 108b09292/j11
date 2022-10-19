package j11;

interface Math1
{
	public void show();	
	public  void add(int a, int b);  //計算a+b
	public  void sub(int a, int b);  //計算a-b
	public  void mul(int a, int b);  //計算a*b
	public  void div(int a, int b);  //計算a/b
}

class Compute1 implements Math1
{
	public int ans;
	public void add(int a,int b) {ans=a+b;}
	public void sub(int a,int b) {ans=a-b;}
	public void mul(int a,int b) {ans=a*b;}
	public void div(int a,int b) {ans=a/b;}
	//override show()
	public void show() {
		System.out.println("ans="+ans);
	}
}
public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute1 cmp=new Compute1();
		cmp.mul(3, 5); //計算3*5
		cmp.show();  //此行會回應 "ans=15" 字串

	}

}
