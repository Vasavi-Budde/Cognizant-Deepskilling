public class ProxyTest {
    public static void main(String[] args) {
        Image ig = new ProxyImage("photo1.jpg");
        System.out.println("First Call:");
        ig.display();
        System.out.println();
        System.out.println("Second Call:");
        ig.display();
    }
}