package Naz.NewYearGiftMaven;
import java.util.Scanner;
/**
 * Hello there this program is a part of epam assignment -New Year's Gift
 * here names of chocolates and sweets are entered by user and 
 * a random gift box is created from this number of candies are identified , sorting chocolates in gift box
 * here all OOP's concepts -encapsulation,inheritance,Polymorphism are covered
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Please enter sweets and chocolates to be packed as gifts except gulabjamun and Cadbury");
        Sweets gulabjamun=new Sweets();
        gulabjamun.setGifts();
        //sweet object is created-----------
        Choco Cadbury=new Choco();
        Cadbury.setGifts();
        //chocolate object is created------------
        System.out.println("Here is a gift for you....");
        //A predefined gift box
        String GiftBox[]= {"gulabjamun","caramel","mango","Cadbury"};
        Candies surpriseGift=new Candies();
        
        System.out.println("The no of candies in your box are: "+
        surpriseGift.findCandies(GiftBox));
        
        System.out.println("The weight of candies in your box are: "+
                surpriseGift.getWeight(GiftBox));
   
        int weight=surpriseGift.getWeight(GiftBox)+Cadbury.getWeight(GiftBox)+gulabjamun.getWeight(GiftBox);
        System.out.println("The weight of your gift box are: "+weight+" grams");
        
        //sorting chocolates in gift box in any order/option
        for(int i=0;i<GiftBox.length;i++)
        {
        	for(int j=i;j<GiftBox.length;j++)
        	{
        		if(GiftBox[i].compareTo(GiftBox[j])<0)
        		{
        			String temp=GiftBox[i];
        			GiftBox[i]=GiftBox[j];
        			GiftBox[j]=temp;
        		}
        	}
        }
        //after sorting the chocolates
        System.out.print("Your NewYear's gift is\n ");
        for(int i=0;i<GiftBox.length;i++)
        {
        	System.out.print(GiftBox[i]+" ");
        }
        System.out.println("\nEnter minimum and maximum price range(from 0 to 2rupees)");
        float minprice,maxprice;
        minprice=in.nextFloat();
        maxprice=in.nextFloat();
        System.out.println("\n The candies in given price range are as follows");
        Candies Candy=new Candies();
        String pricecan[]=Candy.getCandies(minprice,maxprice);
        for(int i=0;i<pricecan.length;i++) {
        	if(pricecan[i]!=null)
        	System.out.print(pricecan[i]+" ");}
        System.out.print("\nEnjoy with your Gift\n");
    }
}
