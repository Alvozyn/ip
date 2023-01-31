package duke;

import java.util.Scanner;

public class Ui {
    private final Scanner sc;

    /**
     * constructor of the Ui class
     * initialise scanners sc
     */
    public Ui() {
        sc = new Scanner(System.in);
    }

    /**
     * greets the user
     */
    public void greet() {
        System.out.println("Hello I'm duke.\nWhat can I do for you?");
    }

    /**
     * displays the logo
     */
    public void displayLogo() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
    }

    /**
     * prints a line
     */
    public void showLine() {
        System.out.println("======================================================================");
    }

    /**
     * gets user input
     * @return user input
     */
    public String getInput() {
        return sc.nextLine();
    }

    /**
     * prints out text
     * @param text to be print
     */
    public void printText(String text) {
        System.out.println(text);
    }


}

