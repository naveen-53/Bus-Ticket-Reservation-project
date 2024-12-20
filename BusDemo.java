package busResv;

import java.util.*;
import java.sql.*;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		
		busDAO busdao = new busDAO();
		
		
		int userop=1;
		Scanner sc=new Scanner(System.in);
		busdao.displayInfo();
		
		while(userop==1) {
			System.out.println("Enter 1 to book and 2 to exit.");
			userop=sc.nextInt();
			
			if(userop==1) {
				Booking b1 = new Booking();
				if(b1.isAvailable()) {
					System.out.println("Your Booking is Confirmed.");
				}
				else
					System.out.println("Sorry Bus is Full, Try Another bus.");
			}
			
		}
		sc.close();
	}
	

}
