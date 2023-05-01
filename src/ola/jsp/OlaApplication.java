package ola.jsp;

import java.util.Scanner;

public class OlaApplication 
{
	ola o=new ola();
	Scanner sc=new Scanner(System.in);
	int point=1;
	public void login() 
	{
		if(o.a==null)
		{
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("contact Number");
			long cno=sc.nextLong();
			System.out.println("Address");
			String add=sc.next();
			System.out.println("Enter Gender");
			char gen=sc.next().charAt(0);
			o.a=new Account(name,cno,gen,add);
			System.out.println("Account is Created");
		}
		else
		{
		System.out.println("Already Account is Existed");
		}
	}
	public void logout()
	{
		if(o.a!=null)
		{
			o.a=null;
			System.out.println("Logout Succesfully");
		}
		else
		{
			System.out.println("First Login");
		}
	}
	public void MakeRide()
	{
		if(o.a!=null)
		{
			System.out.println("1.mini 2.prime 3.sweden");
			switch(sc.nextInt())
			{
			case 1:
			{
				System.out.println("Enter From");
				String f=sc.next();
				System.out.println("Enter TO");
				String t=sc.next();
				System.out.println("Enter K.M");
				int km=sc.nextInt();
				o=new mini(f,t,km);
				point++;
				System.out.println("BOOKED");
				break;
			}
			case 2:
			{
				System.out.println("Enter From");
				String f=sc.next();
				System.out.println("Enter TO");
				String t=sc.next();
				System.out.println("Enter K.M");
				int km=sc.nextInt();
				o=new prime(f,t,km);
				point++;
				System.out.println("BOOKED");
				break;
			}
			case 3:
			{
				System.out.println("Enter From");
				String f=sc.next();
				System.out.println("Enter TO");
				String t=sc.next();
				System.out.println("Enter K.M");
				int km=sc.nextInt();
				o=new swedan(f,t,km);
				point++;
				System.out.println("BOOKED");
				
			}
			}
		}
		else
		{
			System.out.println("First Login");
		}
	}
	public void CancelRide()
	{
		if(point==1)
		{
			System.out.println("First Make Ride");
		}
		else
		{
			o=new ola();
			point--;
			System.out.println("Oops");
		}
	}
	public void MakeBill()
	{
		if(point==1)
		{
			System.out.println("First Make Ride");
		}
		else
		{
			if(o instanceof mini)
			{
				mini m=(mini)o;
				int Wallet=m.km*m.p;
				System.out.println("Enter money more than"+Wallet);
				int money=sc.nextInt();
				if(money>=Wallet)
				{
					System.out.println("Payement Successfull");
				}
				else
				{
					System.out.println("Server slow");
				}
			}
				else if(o instanceof prime)
				{
					prime m=(prime)o;
					int Wallet=m.km*m.p;
					System.out.println("Enter money more than"+Wallet);
					int money=sc.nextInt();
					if(money>=Wallet)
					{
						System.out.println("Payement Successfull");
					}
					else
					{
						System.out.println("Server slow");
					}
					
				}
				else
				{
					swedan m=(swedan)o;
					int Wallet=m.km*m.p;
					System.out.println("Enter money more than"+Wallet);
					int money=sc.nextInt();
					if(money>=Wallet)
					{
						System.out.println("Payement Successfull");
					}
					else
					{
						System.out.println("Server slow");
					}
					
				}
			}
	}
}
			
		
	
			
			
			
			
			
		
	
	
		



