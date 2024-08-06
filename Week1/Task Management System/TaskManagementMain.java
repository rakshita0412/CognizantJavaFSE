package Ex5;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        Task t1 = new Task("T001", "Develop User Interface", "Completed");
        Task t2 = new Task("T002", "Set up database", "In Progress");
        Task t3 = new Task("T003", "Write Documentation", "Not Started");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        taskList.traverseTasks();

        Task t = taskList.searchTask("T002");
        System.out.println("Found: " + t);

        taskList.deleteTask("T002");

        taskList.traverseTasks();
    }
}
