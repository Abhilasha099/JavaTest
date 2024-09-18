
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean flag=false;
		
		
		//11%2=1
		//11%i
		int val=31;
		boolean flag=false;
		for(int i=2;i<=11/2;i++)
		{
			
			if(val%i==0)
				
			{
				flag=true;
				break;
			}
			
		}
		
		if(flag)
		{
			System.out.println("It is not prime");
		}
		else
		{
			System.out.println("It is prime");
		}
	}

}
