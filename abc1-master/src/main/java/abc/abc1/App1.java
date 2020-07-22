package abc.abc1;
import java.util.Scanner;
public class App1 
{
    public static void main( String[] args )
    {
    	int num_sweets;
    	int num_chocos;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter total number of Sweets in the Gift:");
    	num_sweets=sc.nextInt();
    	Sweets1 s[]=new Sweets1[num_sweets];
    	for(int i=0;i<num_sweets;i++)
    	{
    		System.out.println("Enter details of sweet "+(i+1)+":");
    		System.out.print("Name:");
    		String snam=sc.next();
    		System.out.print("Quantity:");
    		int squan=sc.nextInt();
    		System.out.print("Cost:");
    		int scos=sc.nextInt();
    		s[i]=new Sweets1(snam,squan,scos);
    	}
    	System.out.println("Enter total number of Chocolates in the Gift:");
    	num_chocos=sc.nextInt();
    	Candy_Chocos c[]=new Candy_Chocos[num_chocos];
    	for(int i=0;i<num_chocos;i++)
    	{
    		System.out.println("Enter details of Chocolate "+(i+1)+":");
    		System.out.print("Name:");
    		String cnam=sc.next();
    		System.out.print("Flavour:");
    		String cflav=sc.next();
    		System.out.print("Cost:");
    		int ccos=sc.nextInt();
    		c[i]=new Candy_Chocos(cnam,cflav,ccos);
    	}
    	New_Gift ng=new New_Gift(s,c);
    	ng.weight();
    	ng.sort_chocos();
    	ng.find_candiys();
    	sc.close();
        
    }
}

