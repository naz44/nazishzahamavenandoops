package Naz.NewYearGiftMaven;
import java.util.Scanner;
public class Choco implements Gift{
	private String yourChocolates[]=new String[5];
	private int chno=0;
	private int weight[]=new int[5];
	Scanner inp= new Scanner(System.in);
	Choco(){}
	
	public void setGifts()
	{
		System.out.println("Please enter the name of Chocolate\t");
		String newChoc=inp.next();
		System.out.println("Please enter the weight(grams)\t");
		int wei=inp.nextInt();
		this.chno=1;
		this.yourChocolates[0]="Cadbury";
		this.weight[0]=12;
		while(this.chno<5)
		{
			this.yourChocolates[this.chno]=newChoc;
			this.weight[this.chno]=wei;
			this.chno+=1;
		}
		
	}//method-set
	public int getWeight(String Cname[])
	{
		//calculating weight of your gift
		int totWeight=0;
		for(int i=0;i<Cname.length;i++)
		{
			for(int j=0;j<chno;j++) {
			if(Cname[i]==yourChocolates[j])
				totWeight+=weight[j];}
		}
		return(totWeight);
	}
	public String[] generateGift() {
		String giftbox[]=new String[chno];
		for(int i=0;i<chno;i++)
		{
			int index=(int) (Math.random() * ( chno ));
			giftbox[i]=yourChocolates[index];
		}
		return(giftbox);
	}
}//class