package task_version_1_0;

public class Task {

    private String nameTask;
    private String description;
    private int idsTask;
    private String status = "NEW";

    public Task(String nameTask, String description, int idsTask, String status) {
        this.nameTask = nameTask;
        this.description = description;
        this.idsTask = idsTask;
        this.status = status;
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

    public String getStatus() {

        return status;
    }

}
