package task_version_1_0;

import java.util.ArrayList;

public class Epic extends Task{

    ArrayList<Subtask> list = new ArrayList<>();

    public Epic(String nameTask, String description, int id, ArrayList<Subtask> list) {
        super(nameTask, description, id);
        this.list = list;
    }
}
