package Service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataBase implements Serializable {
      private LinkedHashMap<Integer, Task> taskDB = new LinkedHashMap<>();
    private static DataBase instance = new DataBase();

    public void getAllTask(){ // краткое описание задачи с ее номером
        for(Map.Entry<Integer, Task> allTask : taskDB.entrySet()){
            System.out.println("ID задачи: " + allTask.getKey() + " Название: " + allTask.getValue());
        }
    }



    public static void setInstance(DataBase newInstance) { // для синглтона
        instance = newInstance;
    }

    public static DataBase getInstance(){ // для синглтона
        if(instance == null){
            instance = new DataBase();
        }
        return instance;
    }


    public void addTask(int id, Task task){ //добавляем задачу
        taskDB.putIfAbsent(id, task);
    }

    public Task searchTaskById(int id){
        return taskDB.get(id);
    }


    public void removeTaskById(int id){
        taskDB.remove(id);
    }

    @Override
    public String toString() {
        return "Service.DataBase{" +
                "taskDB=" + taskDB +
                '}';
    }
}


