import java.util.*;
public class InventoryManager {
    HashMap<Integer,Product> map = new HashMap<>();
    public void add(Product product){
        map.put(product.id , product);
        System.out.println("Product added Successfully");
    }

//update

    public void update(int id, int quantity , double price){
        Product product = map.get(id);
        if(product != null){
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product updated");
        }
        else{
            System.out.println("Product not found");
        }
    }

//delete
    public void delete(int id){
        if(map.remove(id)!=null){
            System.out.println("Product deleted");
        }
        else{
            System.out.println("Product not found");
        }
    }

    //display

    public void display(){
        if(map.isEmpty()){
            System.out.println("Inventory is empty");
        }
        else{
            for(Product product : map.values()){
                System.out.println(product);
            }
        }
    }

}
