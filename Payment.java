import java.sql.PreparedStatement;

public class Payment {
    private int PaymentID;
    private String ClientName;
    private int ClientID;
    private String OrderDate;
    private int Full_Price;

    public Payment(){}
    public Payment(int PaymentID,String ClientName, int ClientID, String OrderDate, int Full_Price){
        this.PaymentID=PaymentID;
        this.ClientName=ClientName;
        this.ClientID=ClientID;
        this.OrderDate=OrderDate;
        this.Full_Price=Full_Price;
    }

    public int getPaymentID() {
        return PaymentID;
    }

    public String getClientName() {
        return ClientName;
    }

    public int getClientID() {
        return ClientID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public int getFull_Price() {
        return Full_Price;
    }
    public void setPaymentID(int paymentID) {
        PaymentID = paymentID;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public void setFull_Price(int full_Price) {
        Full_Price = full_Price;
    }

    public static void addNewP(Payment p){
        Main m =new Main();
        m.getCon(); //connecting with database
        try {
            //make request
            PreparedStatement ps=m.con.prepareStatement("insert into Payment" +
                    "values(?,?,?,?,?,?,?)");
            //add values
            ps.setInt(1,p.PaymentID);
            ps.setString(2,p.ClientName);
            ps.setInt(3,p.ClientID);
            ps.setString(4,p.OrderDate);
            ps.setInt(5,p.Full_Price);
            ps.executeUpdate();
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Your Bill: " +
                "PaymentID=" + PaymentID +
                ", ClientName=" + ClientName +
                ", ClientID=" + ClientID +
                ", OrderDate=" + OrderDate +
                ", Full_Price=" + Full_Price;
    }
}
