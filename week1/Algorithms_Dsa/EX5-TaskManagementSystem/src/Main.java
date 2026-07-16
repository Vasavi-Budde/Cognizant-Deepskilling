public class Main {
    public static void main(String[] args) {
        TaskLinkedList tasks = new TaskLinkedList();
        tasks.addTask(
                101,
                "Design UI",
                "Pending");
        tasks.addTask(
                102,
                "Develop Backend",
                "In Progress");
        tasks.addTask(
                103,
                "Testing",
                "Pending");
        System.out.println(
                "All Tasks:");
        tasks.traverseTasks();
        System.out.println("\nSearching Task:");

        Task task = tasks.searchTask(102);
        System.out.println(task);
        System.out.println("\nDeleting Task:");
        tasks.deleteTask(102);
        System.out.println("\nUpdated Tasks:");
        tasks.traverseTasks();
    }
}