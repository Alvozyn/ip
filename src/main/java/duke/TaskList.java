package duke;
import duke.task.Task;

import java.util.ArrayList;

public class TaskList {

    ArrayList<Task> allTasks;

    public TaskList(){
        allTasks =  new ArrayList<Task>();
    }

    public int getNumberOfTask() {
        return allTasks.size();
    }

    public String printList() {
        String printedList = "";
        for (int i = 0; i < allTasks.size(); i++) {
            int index = i + 1;
            printedList = printedList.concat(index + ". "+ allTasks.get(i).toString()) + "\n";
        }

        if (allTasks.size() == 0) {
            return "Your list is currently empty, :)";
        }

        return printedList;
    }

    public void addTask(Task task) {
        allTasks.add(task);
    }

    public void markTask(int index) {
        allTasks.get(index - 1).mark();
    }

    public void unmarkTask(int index) {
        allTasks.get(index - 1).unmark();
    }

    public void deleteTask(int index) {
        System.out.println(" " + allTasks.get(index - 1).toString());
        allTasks.remove(index-1);
    }

    public ArrayList<Task> getTasks() {
        return allTasks;
    }


}
