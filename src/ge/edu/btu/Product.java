package ge.edu.btu;

public abstract class Product {
    private String name;
    private int caloriesOnUnit;

    public void Product(){};

    public Product(String name , int caloriesOnUnit)
    {
        this.name=name;
        this.caloriesOnUnit=caloriesOnUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesOnUnit() {
        return caloriesOnUnit;
    }

    public void setCaloriesOnUnit(int caloriesOnUnit) {
        this.caloriesOnUnit = caloriesOnUnit;
    }

    public abstract int CalloriesResult();


}
