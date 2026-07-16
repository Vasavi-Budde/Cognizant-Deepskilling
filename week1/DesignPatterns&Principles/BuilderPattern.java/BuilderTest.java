public class BuilderTest {
    public static void main(String args[]){
        Computer c1 = new Computer.Builder()
        .setCpu("Intel i5")
        .setRam("5GB")
        .setStorage("512GB")
        .build();

        c1.display();
    }
}
