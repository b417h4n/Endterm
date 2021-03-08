import java.sql.*;
import java.util.Scanner;

public class Main {

    public static Connection con;

    public static void getCon() {
        Statement statement = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/endterm", "postgres", "postgres");
            System.out.println("Connected successfully");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        getCon();
        Scanner scan = new Scanner(System.in);
            System.out.println("Please, choose:");
            System.out.println("Make an order {1}");
            System.out.println("Search an order {2}");

            int option = scan.nextInt();


            if (option == 1) {
                    System.out.println("Your Name: ");
                    String ClientName = scan.nextLine();
                    System.out.println("Enter order date: ");
                    String OrderDate = scan.nextLine();
                    int PaymentID = (int)(Math.random() * 100000+1);
                    int ClientID = (int)(Math.random() * 100000+1);
                    System.out.println("Please, choose:");

                Menu p = new Menu();
                p.Menu();


                    Payment pay=new Payment(PaymentID, ClientName, ClientID, OrderDate, FullPrice);
                    pay.addNewP(pay);
                    System.out.println("Information was added");

                }

            }

        }