package day1;

public class work1 
{
	public static void main(String[] args)
	{
		Trial t= new Trial();          //object produced
		t.x=50;                        //value assigned for x
		System.out.println("First value of number: " +t.x);  //screen caption
		multiply(t);        //method           
		System.out.println("First value of number: " +t.x);  //screen caption
	}
	public static void multiply(Trial t)  //multiply method
	{
		t.x=t.x*2;   //variable multiplied by 2
	}

}
class Trial  //trial class
{
	public int x; //value x
}
