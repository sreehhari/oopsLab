class Patient
{
	private int id;
	private int age;
	private int bloodtype;
	
	Patient()
	{
		this.id=id;
		this.age=age;
		this.bloodtype=bloodtype;
	}
	
	Patient(int id,int age,int bloodtype)
	{
		id=0;
		age=0;
		bloodtype=0;
	}
	
	public int getid(int id)
	{
		return id;
	}
	
	public int getage(int age)
	{
		return age;
	}
	
	public int getbloodtype(int bloodtype)
	{
		return bloodtype;
	}
}

class TestPatient
{
	public static void main(String[] args)
	{	System.out.println("Patient1:");
		Patient p1=new Patient();
		System.out.print("id:"+p1.getid(2));
		System.out.print("\nage:"+p1.getage(40));
		System.out.println("\nbloodtype:"+p1.getid(0));
		
		System.out.println("\nPatient2:");
		Patient p2=new Patient();
		System.out.print("id:"+p2.getid(3));
		System.out.print("\nage:"+p2.getage(31));
		System.out.println("\nbloodtype:"+p2.getid(1));
	}
}	
	
	

