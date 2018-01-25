
public class twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[][]=new String[3][3];

str[0][0]="A";
str[0][1]="B";
str[0][2]="C";

str[1][0]="A1";
str[1][1]="B1";
str[1][2]="C1";

str[2][0]="A3";
str[2][1]="B3";
str[2][2]="B3";

int rows=str.length;

int columns=str[0].length;
 for(int rownum=0;rownum<rows;rownum++)
 {
	 for(int columnum=0;columnum<columns;columnum++)
	 {
		 System.out.print(str[rownum][columnum]+"---");
	 }
	 System.out.println();
 }



	}

}
