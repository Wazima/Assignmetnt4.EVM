package application;

import java.io.IOException;
import java.sql.*;
public class Mysql {

	
		public static int sqlDataEntryAdmin(String id, String password) throws IOException  {
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","tiger12345");
				
				Statement stmt=con.createStatement();
				stmt.execute("use mysql");
				//ResultSet rs=stmt.executeQuery("select * from account");
				/*String sql="Insert into administrator values(?,?)";	//name,pin,account type,balance
				PreparedStatement stat=con.prepareStatement(sql);
				stat.setString(1,id);
				stat.setString(2,password);
				
				int x=stat.executeUpdate();*/
				
				
				//retrieve data
				ResultSet rs=stmt.executeQuery("select * from administrator");
				String Aid=" ";
				String A_pass=" ";
				while(rs.next())
				{
					Aid=rs.getString(1);
					A_pass= rs.getString("password");
					
					System.out.println(Aid+" "+A_pass);
					
				}
			
				if((id==Aid)&&(password==A_pass))
				{
					return 1;
				}
				
				con.close();
			}
			catch(SQLException throwables)
			{
				throwables.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		return 0;

		}

		
		
		public static void sqlDataEntryVoter(String id,String party)  {
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","tiger12345");
				
				Statement stmt=con.createStatement();
				stmt.execute("use mysql");
				//ResultSet rs=stmt.executeQuery("select * from account");
				String sql="Insert into vote values(?,?)";	//name,pin,account type,balance
				PreparedStatement stat=con.prepareStatement(sql);
				stat.setString(1,id);
				stat.setString(2,party);
				//stat.setInt(1,pin);
				//stat.setString(1,account_type);
				//stat.setDoublehttps://ci.eclipse.org/datatools/job/org.eclipse.datatools_master/lastSuccessfulBuild/artifact/site/target/repository/https://ci.eclipse.org/datatools/job/org.eclipse.datatools_master/lastSuccessfulBuild/artifact/site/target/repository/(1,balance);
				int x=stat.executeUpdate();
				
				
				//retrieve data
				ResultSet rs=stmt.executeQuery("select * from vote");
				
				while(rs.next())
				{
					int Vid=rs.getInt(1);
					String partyN= rs.getString("party_name");
					
					System.out.println(Vid+" "+partyN);
					
				}
				con.close();
			}
			catch(SQLException throwables)
			{
				throwables.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}

		}
		
		//party data
		public static void sqlDataEntryParty(String partyName,String LeaderName,String slogan)  {
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","tiger12345");
				
				Statement stmt=con.createStatement();
				stmt.execute("use mysql");
				//ResultSet rs=stmt.executeQuery("select * from account");
				String sql="Insert into party values(?,?,?)";	//name,pin,account type,balance
				PreparedStatement stat=con.prepareStatement(sql);
				stat.setString(1,partyName);
				stat.setString(2,LeaderName);
				stat.setString(3,slogan);
				int x=stat.executeUpdate();
				
				
				//retrieve data
				ResultSet rs=stmt.executeQuery("select * from party");
				
				while(rs.next())
				{
					
					String partyN= rs.getString("p_name");
					String vCount= rs.getString("vote_count");
					
					System.out.println(partyN+" "+vCount);
					
				}
				con.close();
			}
			catch(SQLException throwables)
			{
				throwables.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}

		}
		
		public static void updateParty(String pName,int count) {
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","tiger12345");
				
				Statement stmt=con.createStatement();
				//retrieve data
				ResultSet rs=stmt.executeQuery("select * from party");
				String partyN;
				int vCount = 0;
				while(rs.next())
				{
					
					partyN= rs.getString("p_name");
					vCount= rs.getInt("vote_count");
					
					System.out.println(partyN+" "+vCount);
					
				}
				
				vCount+=count;
				
				
				
				
				stmt.execute("use mysql");
				String sql="Insert into party values(?,?,?,?)";	
				PreparedStatement stat=con.prepareStatement(sql);
				
				stat.setInt(4,count);
				int x=stat.executeUpdate();
				
				
				
				con.close();
			}
			catch(SQLException throwables)
			{
				throwables.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		
		//getting percentage
		public static void Percentage(String pName,int count) {
			
		}
		
		//getting result
		public static void Result() {
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","tiger12345");
				
				Statement stmt=con.createStatement();
				//retrieve data
				ResultSet rs=stmt.executeQuery("select * from party where MAX(count)");
				String partyN;
				int vCount = 0;
				while(rs.next())
				{
					
					partyN= rs.getString("p_name");
					vCount= rs.getInt("vote_count");
					
					System.out.println(partyN+" "+vCount);
					
				}
				//try printing it in fxml
				
				
				
				
				
				stmt.execute("use mysql");
				String sql="Insert into party values(?,?,?,?)";	
				PreparedStatement stat=con.prepareStatement(sql);
				
				
				int x=stat.executeUpdate();
				
				
				
				con.close();
			}
			catch(SQLException throwables)
			{
				throwables.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}

	}


