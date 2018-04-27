class B 
{
	public static void main(String[] args) 
	{
		boolean isPrime=true;
		for( int i=1;i<10;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
           System.out.print(i+ " , ");
			}
			else
			{
				isPrime=true;
			}
		}
	}
}
