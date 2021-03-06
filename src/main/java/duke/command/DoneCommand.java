package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.exception.DukeException;
import duke.task.Task;

public class DoneCommand extends Command {

    private int taskDone;

    public DoneCommand(int taskDone) {
        this.taskDone = taskDone;
    }

    @Override
    public String execute(TaskList tasks, Storage storage) throws DukeException {
        Task task = tasks.completeTask(taskDone);
        storage.writeData(tasks);
        return task.toString();
    }
}
