package ru.cyberc3dr.jmixpm.view.task;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.cyberc3dr.jmixpm.entity.Task;
import ru.cyberc3dr.jmixpm.view.main.MainView;

@Route(value = "tasks/:id", layout = MainView.class)
@ViewController(id = "pm_Task.detail")
@ViewDescriptor(path = "task-detail-view.xml")
@EditedEntityContainer("taskDc")
public class TaskDetailView extends StandardDetailView<Task> {
}