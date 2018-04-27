class  A
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int i,m=0,flag=0;
		m=num/2;
		for(i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("number is prime");
	}
}
