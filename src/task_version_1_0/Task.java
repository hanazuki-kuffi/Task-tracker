package task_version_1_0;

public class Task {

    private String nameTask;
    private String description;
    private int id;
    private Status status;

    public Task(String nameTask, String description, int id) {
        this.nameTask = nameTask;
        this.description = description;
        this.id = id;
        this.status = Status.NEW;
    }


    public String getNameTask() {

        return nameTask;
    }
    public String getDescription() {

        return description;
    }

    public int getId() {

        return id;
    }

    public Status getStatus() {
        return status;
    }

}
