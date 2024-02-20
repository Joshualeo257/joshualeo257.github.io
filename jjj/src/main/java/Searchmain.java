
import java.util.*;
import java.sql.*;  
public class Searchmain {
    static Scanner g = new Scanner(System.in);
    public static String[] data; // Data to be searched
    public static Map<String, List<Integer>> map = new HashMap<>();
    public static String arg;
    static List<String> finallst;
    static List<String> URL;
    @SuppressWarnings("null")
	public static List<String> processValue(String Searchquery){
    	
    	 //System.out.println("Enter keyword");  
        String str = Searchquery;
        String [] strlist = str.split(" ");
       try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con =DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/sonoo","root","adis");   
        Statement stmt=con.createStatement();  
        String chk = "y";
        finallst = new ArrayList<>();
        URL = new ArrayList<>();
        for (String st : strlist) {
            ResultSet rs=stmt.executeQuery("select * from internet where title like '%"+st+"%'");  
            while(rs.next()) { 
                String result = rs.getString(1);
                String resultu = rs.getString(2);
                                
                for(String s : finallst)
                {
                    if( result.equals(s))
                    {
                        chk = "n";
                    }                       
                }
                if (chk == "y")
                {
                    //System.out.println(result);
                    finallst.add(result);
                    URL.add(resultu);
                }
                chk = "y";    
                } 
        } 
        System.out.println(finallst);
        System.out.println(URL);
        con.close();
        }
        catch(Exception e)
       { System.out.println(e);}
       return finallst ;		
    }
	public static void main (String[] args) {
		processValue(arg);
	}
    
    }
