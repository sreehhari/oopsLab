class Shirt
{
	private double collorsize;
	private double sleevelength;
	static String material="Cotton";
	
	Shirt()
	{
		this.collorsize=collorsize;
		this.sleevelength=sleevelength;
		this.material=material;
	}
	
	public double getcs(double collorsize)
	{
		return collorsize;
	}
	public double getsl(double sleevelength)
	{
		return sleevelength;
	}
	
	
}

public class TestShirt
{
	public static void main(String[] args)
	{	System.out.print("Shirt1:");
		Shirt s1=new Shirt();
		System.out.print("Collor Size  :"+s1.getcs(21.55));
		System.out.print("Sleeve Length:"+s1.getsl(17.25));
		System.out.print("Material     :"+s1.material);
		
		System.out.print("Shirt2:");
		Shirt s2=new Shirt();
		System.out.print("Collor Size  :"+s2.getcs(19.75));
		System.out.print("Sleeve Length:"+s2.getsl(16.2));
		System.out.print("Material     :"+s2.material);
		
		System.out.print("Shirt3:");
		Shirt s3=new Shirt();
		System.out.print("Collor Size  :"+s3.getcs(24.7));
		System.out.print("Material     :"+s3.material);
	}
}

