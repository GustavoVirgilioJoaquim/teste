package entities;

public class ProductBasic {
    private String name;
    private double price;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public ProductBasic(String name, double price){
        setName(name);
        setPrice(price);
    }

    public void Average (){

    }

}
