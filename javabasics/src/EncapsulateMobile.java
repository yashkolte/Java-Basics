import java.util.Scanner;
import java.sql.*;

public class EncapsulateMobile {

    public static void main(String[] args) {
        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish the connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mobile", "root", "yash");
            
            if (con != null) {
                System.out.println("Connected to the database!");
            }

            // Step 3: Get input from the user
            EncapsulateMobile_Private mobileDetail = new EncapsulateMobile_Private();
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter Mobile Brand: ");
            mobileDetail.setMobileBrand(scanner.nextLine());

            System.out.print("Enter Mobile Model: ");
            mobileDetail.setMobileModel(scanner.nextLine());

            System.out.print("Enter Mobile Price: ");
            mobileDetail.setMobilePrice(scanner.nextInt());

            scanner.nextLine(); // consume newline left-over
            System.out.print("Enter Mobile Configuration: ");
            mobileDetail.setMobileConfig(scanner.nextLine());

            // Step 4: Insert data into the database
            String insertQuery = "INSERT INTO mobile_details (brand, model, price, config) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, mobileDetail.getMobileBrand());
            pstmt.setString(2, mobileDetail.getMobileModel());
            pstmt.setInt(3, mobileDetail.getMobilePrice());
            pstmt.setString(4, mobileDetail.getMobileConfig());
            int rowsInserted = pstmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("A new mobile detail was inserted successfully!");
            }

            // Step 5: Retrieve and display the data
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mobile_details");

            System.out.println("Mobile Details from Database:");
            while (rs.next()) {
                System.out.println(rs.getString("brand") + "  " + 
                                   rs.getString("model") + "  " + 
                                   rs.getInt("price") + "  " + 
                                   rs.getString("config"));
            }

            // Step 6: Close the connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}
