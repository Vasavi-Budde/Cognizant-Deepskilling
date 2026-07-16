public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(
                        101,
                        "Ravi",
                        5000),

                new Order(
                        102,
                        "Priya",
                        2000),

                new Order(
                        103,
                        "Akash",
                        8000),

                new Order(
                        104,
                        "Sneha",
                        3000)
        };

        System.out.println(
                "Before Sorting:");

        SortingOperations.display(orders);
        System.out.println(
                "\nAfter Bubble Sort:");
        SortingOperations.bubbleSort(orders);
        SortingOperations.display(orders);
        Order[] orders2 = {
                new Order(
                        101,
                        "Ravi",
                        5000),

                new Order(
                        102,
                        "Priya",
                        2000),

                new Order(
                        103,
                        "Akash",
                        8000),

                new Order(
                        104,
                        "Sneha",
                        3000)
        };
        System.out.println(
                "\nAfter Quick Sort:");

        SortingOperations.quickSort(
                orders2,
                0,
                orders2.length - 1);
        SortingOperations.display(orders2);
    }
}