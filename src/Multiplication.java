
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=Multiply(5,10);
		System.out.println(result);
		
		
	}
		
		public static int Multiply(int i,int j)
		{
			
			int k=1;
			
			int sum=0;
			while(k<=10)
			{
			sum=sum+i;	
			
			k++;
			//System.out.println(sum);
			}
			
			return sum;
		}
		

	
	
	
}
