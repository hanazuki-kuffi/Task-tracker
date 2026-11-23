package task_version_1_0;

import java.util.ArrayList;

public class Epic extends Task{

    ArrayList<Subtask> list;

    public Epic(String nameTask, String description, int id) {
        super(nameTask, description, id);
        this.list = new ArrayList<>();
    }


}
