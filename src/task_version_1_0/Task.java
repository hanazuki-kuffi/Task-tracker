package task_version_1_0;

public class Task {

    private String nameTask;
    private String description;
    private int idsTask;
    private Status status;

    public Task(String nameTask, String description, int idsTask) {
        this.nameTask = nameTask;
        this.description = description;
        this.idsTask = idsTask;
        this.status = Status.NEW;
    }


    public String getNameTask() {

        return nameTask;
    }
    public String getDescription() {

        return description;
    }

    public int getIdsTask() {

        return idsTask;
    }

    public Status getStatus() {
        return status;
    }

}
