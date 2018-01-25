
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]=new String[3];
		str[0]="xxx";
		str[1]="yyy";
		str[2]="hhh";
		for(int x=0;x<str.length;x++)
		{
			System.out.println(str[x]);
		}

		int t[]=new int[2];
		t[0]=1;
		t[1]=2;
		for(int i=t.length-1;i>=0;i--)
			
		{
		System.out.println(t[i]);	
		}
	}

}
