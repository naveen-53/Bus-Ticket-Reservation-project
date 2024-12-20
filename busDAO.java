package busResv;

import java.sql.*;

public class busDAO {
	public void displayInfo() throws SQLException {
		String query = "select * from bus";
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Bus no: " +rs.getInt(1)+"\t");
			
			if(rs.getInt(2)==0)
				System.out.print("AC is not available.\t");
			else
				System.out.print("AC is available.\t");
			System.out.println("Capacity : " +rs.getInt(3));
				
		}
	
	}
	
	public int getCapacity(int busno) throws SQLException {
		String query= "Select capacity from where id="+busno;
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
	}

}
