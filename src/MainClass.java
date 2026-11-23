import task_version_1_0.Subtask;
import task_version_1_0.Task;

public class MainClass {

    public static void main(String[] args) {

        Task task = new Task("clean home", "Clean  home 100% for all the week", 1);

        System.out.println(task.getNameTask());
        System.out.println(task.getDescription());
        System.out.println(task.getId());
        System.out.println(task.getStatus());

        Subtask subtask = new Subtask("clean kitchen", "clean all tools and dishes", 2);
        System.out.println(subtask.getNameTask());


    }
}
