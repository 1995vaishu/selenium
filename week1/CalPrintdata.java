package week1.day2;

public class CalPrintdata
{
	
	public void print(int value)
	{
		System.out.println(value);
		
	}
	public void print(double value)
	{
		System.out.println(value);
		
	}
	public void print(float value)
	{
		System.out.println(value);
		
	}
	public static void main(String[] args) {

	Calculator obj = new Calculator();
	CalPrintdata pdata = new CalPrintdata();
	int result = obj.add(5, 2, 4);
	pdata.print(result);
	 int result1 = obj.sub(5,3);
	pdata.print(result1);
	double result2 = obj.multiply(6,6);
	pdata.print(result2);
	float result3 = obj.divide(3,4);
	pdata.print(result3);
	

}
}

