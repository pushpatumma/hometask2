package abc.abc1;

public class New_Gift {
	Candy_Chocos ch[];
	Sweets1 sw[];
	int gw=0;
	public New_Gift(Sweets1 s[],Candy_Chocos c[])
	{
		this.sw=s;
		this.ch=c;
	}
	public void weight()
	{
		for(int i=0;i<sw.length;i++)
		{
			gw+=sw[i].cost;
		}
		for(int i=0;i<ch.length;i++)
		{
			gw+=ch[i].cost;
		}
		System.out.println("Calculating the given details for making Children Gifts");
		System.out.println("Total Weight of Children's gift is:"+gw);
	}
	public void sort_chocos()
	{
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length-i-1;j++)
			{
				if(ch[j].cost>ch[j+1].cost)
				{
					Candy_Chocos tmp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=tmp;
				}
			}
		}
	}
	public void find_candiys()
	{
		System.out.println("Candies in the Children's Gift whose cost is less than 100 is:");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i].cost>=100)
			{
				break;
			}
			System.out.println("Name:"+ch[i].name);
			System.out.println("Flavour:"+ch[i].flavour);
			System.out.println("Cost:"+ch[i].cost);
		}
	}

}
