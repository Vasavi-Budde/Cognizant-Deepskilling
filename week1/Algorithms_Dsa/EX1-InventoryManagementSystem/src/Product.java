public class Product{
    int id;
    String name;
    int quantity;
    double price;

    public Product(int id,String name,int quantity,double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString(){
        return "Product Id: "+id + ", Name: "+name
        +"Quantity: "+quantity + "price: "+price;
    }
}