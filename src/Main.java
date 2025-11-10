import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("123");
        DataBase db = new DataBase();

        //System.out.println(db.searchTaskById(1));

       person.createNewTask();

        //Task test = new Task("ads", "asd", "asd");
        //db.addTask(3, test);

        //person.changeTaskName();
        db.getAllTask();

        //System.out.println(db.searchTaskById(1));
    }
}