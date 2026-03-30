package ru.cyberc3dr.jmixpm.view.projecttasks;

import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.lang.Nullable;
import ru.cyberc3dr.jmixpm.entity.Project;
import ru.cyberc3dr.jmixpm.entity.Task;

@ViewController(id = "pm_ProjectTasksView")
@ViewDescriptor(path = "project-tasks-view.xml")
@DialogMode(width = "64em")
public class ProjectTasksView extends StandardView {

    @ViewComponent
    private CollectionLoader<Task> tasksDl;

    public void setProjectId(@Nullable Project project) {
        if(project != null) {
            tasksDl.setParameter("projectId", project.getId());
        } else {
            tasksDl.removeParameter("projectId");
        }

        tasksDl.load();
    }
}