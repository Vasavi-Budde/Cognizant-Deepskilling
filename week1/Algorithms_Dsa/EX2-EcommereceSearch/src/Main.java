public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,
                        "Keyboard",
                        "Accessories"),

                new Product(102,
                        "Laptop",
                        "Electronics"),

                new Product(103,
                        "Mobile",
                        "Electronics"),

                new Product(104,
                        "Mouse",
                        "Accessories")
        };

        System.out.println("Linear Search:");

        Product p1 =
                SearchOperations.linearSearch(
                        products,
                        "Laptop");

        System.out.println(p1);

        System.out.println();

        System.out.println("Binary Search:");

        Product p2 =
                SearchOperations.binarySearch(
                        products,
                        "Laptop");

        System.out.println(p2);
    }
}