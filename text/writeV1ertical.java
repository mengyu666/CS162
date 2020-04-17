package text;
public class writeV1ertical
{
	public static void main(String args[])
	{
		System.out.println(writeVertical(1234));
	}


public static int writeVertical(int n)
 {
	if(n < 10)
	 {
		return(n);
	 }
	else  //n has more than two numbers
	 {

		System.out.println(n%10);
		//System.out.println("n is n"+n);
		//System.out.println(n/10);
	     return writeVertical(n/10);
		
	 }
 }

}
