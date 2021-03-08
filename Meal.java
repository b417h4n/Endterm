public class Meal extends Menu {
    private int ClientID;
    private int DishID;
    private int PaymentID;

    public Meal(){}
    public Meal(int ClientID, int DishID, int PaymentID){
        this.ClientID=ClientID;
        this.DishID=DishID;
        this.PaymentID=PaymentID;
    }

    public int getClientID() {
        return ClientID;
    }

    @Override
    public int getDishID() {
        return DishID;
    }

    public int getPaymentID() {
        return PaymentID;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    @Override
    public void setDishID(int dishID) {
        DishID = dishID;
    }

    public void setPaymentID(int paymentID) {
        PaymentID = paymentID;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "ClientID=" + ClientID +
                ", DishID=" + DishID +
                ", PaymentID=" + PaymentID +
                '}';
    }
}