package task_version_1_0;

import java.util.ArrayList;

public class Epic extends Task{

    ArrayList<String> list = new ArrayList<>();

    public Epic(String nameTask, String description, int idsTask, String status){
        super(nameTask, description, idsTask, status);
    }
}
