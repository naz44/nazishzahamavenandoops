package Naz.NewYearGiftMaven;

class Candies extends Choco{//inheritance
	private String candyName[]={"strawberry","mango","chocofills","orange","caramel"};
	private int weightCandy[]= {5,6,7,8,9};
	private float price[]= {0.5f,1.4f,2.5f,1.3f,2.4f};
	Candies()
	{//empty constructor
	}
	public int findCandies(String s[]) {
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<5;j++)
				if(s[i]==candyName[j])
					count+=1;
		}
		return(count);
	}
	public int getWeight(String s[])
	{
		int totWeight=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<5;j++) {
			if(s[i]==candyName[j])
				totWeight+=weightCandy[j];}
		}
		return(totWeight);
	}
	public String[] getCandies(float minprice,float maxprice)
	{
		String can[]=new String[5];
		int k=0;
		for(int i=0;i<5;i++)
		{
		 if(price[i]>=minprice && price[i]<=maxprice)
			 can[k++]=candyName[i];
		}
		return(can);
	}
	
}