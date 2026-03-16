package ru.cyberc3dr.jmixpm.view.task;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ru.cyberc3dr.jmixpm.entity.Task;
import ru.cyberc3dr.jmixpm.view.main.MainView;


@Route(value = "tasks", layout = MainView.class)
@ViewController(id = "pm_Task.list")
@ViewDescriptor(path = "task-list-view.xml")
@LookupComponent("tasksDataGrid")
@DialogMode(width = "64em")
public class TaskListView extends StandardListView<Task> {
}