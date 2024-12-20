package busResv;

import java.util.Date;
import java.sql.*;

public class bookingDAO {

	public int getBookedCount(int busno,Date date) throws SQLException {
		
		String query= "Select capacity from where id="+busno;
		Connection con = DbConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqlDate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(3);
	}
}
