package ru.cyberc3dr.jmixpm.view.task;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import ru.cyberc3dr.jmixpm.entity.Project;
import ru.cyberc3dr.jmixpm.entity.Task;
import ru.cyberc3dr.jmixpm.view.main.MainView;

@Route(value = "tasks/:id", layout = MainView.class)
@ViewController(id = "pm_Task.detail")
@ViewDescriptor(path = "task-detail-view.xml")
@EditedEntityContainer("taskDc")
public class TaskDetailView extends StandardDetailView<Task> {
    @Subscribe(id = "taskDc", target = Target.DATA_CONTAINER)
    public void onTaskDcItemPropertyChange(final InstanceContainer.ItemPropertyChangeEvent<Task> event) {
        if("project".equals(event.getProperty())) {
            Project changedProject = (Project) event.getValue();
            if(changedProject != null) {
                event.getItem().setPriority(changedProject.getDefaultTaskPriority());
            }
        }
    }
}