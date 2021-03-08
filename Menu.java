import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Menu {
    private int DishID;
    private String DishName;
    private int Price;

    public Menu(){
    }

    public Menu(int DishID, String DishName, int Price){
        this.DishID=DishID;
        this.DishName=DishName;
        this.Price=Price;
    }

    public int getDishID() {
        return DishID;
    }

    public String getDishName() {
        return DishName;
    }

    public int getPrice() {
        return Price;
    }

    public void setDishID(int dishID) {
        DishID = dishID;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public static void Menu(){ //especially here data from "Company" table
        Main m =new Main();
        m.getCon();
        try {
            //make request to database
            PreparedStatement preparedStatement=m.con.prepareStatement("select *from Menu");
            ResultSet ress=preparedStatement.executeQuery();
            while (ress.next()){
                //get data from all columns
                int DishID=ress.getInt("DishID");
                String DishName=ress.getString("DishName");
                String Price=ress.getString("Price");
                int num=0;
                System.out.println("DishID" + ":"+DishID + ", " + "DishName" + ":" + DishName + ", " + "Price" +  ":" + Price + '{' + num + '}');
                preparedStatement.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Menu:" +
                "DishID=" + DishID +
                ", DishName='" + DishName + '\'' +
                ", Price=" + Price +
                "; ";
    }
}
