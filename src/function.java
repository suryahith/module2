
public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=function.sum(30, 120);
		if(c>100)
		{
			System.out.println("sum is greater than 100");
		}
      
		int s=sumall(4);
		System.out.println(s);
	}
	public static int sum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static int sumall(int n)
	{
		int sum=0;
		for (int x=0;x<=n;x++)
		{
			sum=sum+x;
		}
		return sum;
	}

}
