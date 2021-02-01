package ge.edu.btu;

public class CountlessProduct extends Product {
    private int weight;

    public CountlessProduct(int weight, String name , int caloriesOnUnit )
    {
        super(name,caloriesOnUnit);
        this.weight=weight;
    }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    @Override
    public int CalloriesResult()
    {
        return ((weight/10)*getCaloriesOnUnit());
    }
}
