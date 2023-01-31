package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * ListCommand help calls the function to get the entire list for it to be print
 */
public class ListCommand extends Command{

    /**
     * executes the purpose of the ListCommand
     * @param taskList to get the list of tasks
     * @param storage can be ignored but is required due to the abstract class
     * @param ui handles the displaying of the bot outputs
     */
    @Override
    public void executeCommand(TaskList taskList, Storage storage, Ui ui) {
        ui.printText( "Here are the tasks in your list:");
        String printedList = taskList.printList();
        ui.printText(printedList);
    }

    /**
     * indication if the command should end the program
     * @return false as addCommand is not an ExitCommand
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
