package Service;

import java.io.Serializable;
import java.util.Scanner;

public class Task implements Serializable {
    private String name;
    private String description;
    private String status;
    transient Scanner scanner = new Scanner(System.in);


    public Task(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return name;
    }
}
