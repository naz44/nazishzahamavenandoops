package Naz.NewYearGiftMaven;

import java.util.Scanner;

class Sweets implements Gift{
	private String yourSweets[]=new String[5];
	private int sno=0;
	private int weight[]=new int[5];
	Scanner inp= new Scanner(System.in);
	Sweets(){}
	
	public void setGifts()
	{
		System.out.println("Please enter the name of Sweet\t");
		String newChoc=inp.next();
		System.out.println("Please enter the weight(grams)\t");
		int wei=inp.nextInt();
		this.sno=1;
		this.yourSweets[0]="Cadbury";
		this.weight[0]=12;
		while(this.sno<5)
		{
			this.yourSweets[this.sno]=newChoc;
			this.weight[this.sno]=wei;
			this.sno+=1;
		}
		
	}//method-set
	public int getWeight(String s[]) {
		int totWeight=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<sno;j++)
			{
				if(s[i]==yourSweets[j])
					totWeight+=weight[j];
			}
		}
		return(totWeight);
	}
	public String[] generateGift() {
		String giftbox[]=new String[sno];
		for(int i=0;i<sno;i++)
		{
			int index=(int) (Math.random() * ( sno ));
			giftbox[i]=yourSweets[index];
		}
		return(giftbox);
	}
}