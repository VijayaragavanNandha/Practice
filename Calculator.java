package college;

public class Calculator {

	public static void main(String[] args) {
	int no1=3,no2=11;
	int max=no1>no2?no1:no2;
	while(true)
	{
		if(max%no1==0 && max%no2==0)
		{
			System.out.println(max);
			break;
		}
		max++;
	}
	//System.out.println(max);
	}

}
