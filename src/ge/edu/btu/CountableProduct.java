package ge.edu.btu;

public class CountableProduct extends Product{
    private int quantity;

    public CountableProduct(int quantity, String name , int caloriesOnUnit )
    {
        super(name,caloriesOnUnit);
        this.quantity=quantity;
    }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public int CalloriesResult()
    {
        return (quantity*getCaloriesOnUnit());
    }

}
