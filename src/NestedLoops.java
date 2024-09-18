
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
System.out.println("Logic done");

int k=1;
for(int i=0;i<4;i++)
	
{
	for(int j=1;j<=4-i;j++)
		
	{
		System.out.print(k+" ");
		k++;
		
	}
	
	System.out.println();
	
}

System.out.println("Next Question");

int a=1;
for(int i=0;i<4;i++)
{
for(int j=0;j<i+1 ;j++)
	
{
	System.out.print(a+" ");
	a++;
	
}
System.out.println();
}
	
	
	}

}
