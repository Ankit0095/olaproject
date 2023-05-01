package ola.jsp;

import java.util.Scanner;

public class OlaDriver 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	OlaApplication op=new OlaApplication();
	for(;;)
	{
		System.out.println("1.Login 2.Logout 3.Make a Ride 4.Cancel Ride 5.Make a Bill 6.Exit");
		switch(sc.nextInt())
		{
		case 1:op.login();
		break;
		case 2:op.logout();
		break;
		case 3:op.MakeRide();
		break;
		case 4:op.CancelRide();
		break;
		case 5:op.MakeBill();
		break;
		case 6:
			System.exit(5);
		}
	}
	
}
}
