package ge.edu.btu;

import java.util.ArrayList;

public class Meal{
    private String name;
    private ArrayList ProductsList = new ArrayList<>();

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public ArrayList getProductsList() { return ProductsList; }

    public void
    setProductsList(ArrayList productsList) { ProductsList = productsList; }

    public int TotalCallories()
    {
        return 1;
    }


}
