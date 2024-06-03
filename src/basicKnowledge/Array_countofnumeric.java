package basicKnowledge;
//Assignment 70_In  a String mounika1234 find out the number of numeric values involved
import java.util.Arrays;

public class Array_countofnumeric {
static int countofDigit=0;
	public static void main(String[] args) {
String name ="mounika1234";
char[] c = name.toCharArray();
System.out.println(Arrays.toString(c));
for(int i=0;i<c.length;i++)
{
	boolean ans =Character.isDigit(c[i]);
	if(ans==true)
	{
		countofDigit++;
	}
}
System.out.println(countofDigit);
		
	}

}
