package j11;
abstract class Math
{
	protected int ans;
	public void show()
	{
		System.out.println("ans="+ans);
	}
	public abstract void add(int a, int b);  //計算a+b
	public abstract void sub(int a, int b);  //計算a-b
	public abstract void mul(int a, int b);  //計算a*b
	public abstract void div(int a, int b);  //計算a/b
}
class Compute extends Math{
	public void add(int a,int b) {ans=a+b;}
	public void sub(int a,int b) {ans=a-b;}
	public void mul(int a,int b) {ans=a*b;}
	public void div(int a,int b) {ans=a/b;}
}
public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp=new Compute();
		cmp.mul(3, 5); //計算3*5
		cmp.show();  //此行會回應 "ans=15" 字串

	}

}
