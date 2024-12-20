package busResv;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking  {
	
	String passname;
	int busno;
	Date date;

	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passanger Name: ");
		String passname =sc.next();
		
		System.out.println("Enter Bus no: ");
		int busno =sc.nextInt();
		
		System.out.println("Enter Date (dd-mm-yyyy) : ");
		String dateInput = sc.next();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			Date date = dateformat.parse(dateInput);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		sc.close();

	}
	public boolean isAvailable() throws SQLException {
		busDAO busdao = new busDAO();
		bookingDAO bookingdao = new bookingDAO();
		int capacity = busdao.getCapacity(busno);
		int booked = bookingdao.getBookedCount(busno, date);
		
		return booked<capacity?true:false;
	}
}

	



