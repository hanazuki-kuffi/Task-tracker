package task_version_1_0;

import java.util.HashMap;

public class TaskManager {

    int i;

    HashMap<Integer, Task> tasks = new HashMap<>();
    HashMap<Integer, Subtask> subtasks = new HashMap<>();
    HashMap<Integer, Epic> epics= new HashMap<>();


    public void updateTasks(Task task) {
        tasks.put(task.getId(), task);
        subtasks.put(task.getId(), (Subtask) task);
        epics.put(task.getId(), (Epic) task);
    }

    public void listTasks() {

    }

    public void deleteTasks() {

    }

    public void getIdTasks() {

    }

    public void create() {

    }


    public void removeIdTasks() {

    }

}
