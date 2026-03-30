package ru.cyberc3dr.jmixpm.view.project;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import ru.cyberc3dr.jmixpm.entity.Project;
import ru.cyberc3dr.jmixpm.view.main.MainView;
import ru.cyberc3dr.jmixpm.view.projecttasks.ProjectTasksView;


@Route(value = "projects", layout = MainView.class)
@ViewController(id = "pm_Project.list")
@ViewDescriptor(path = "project-list-view.xml")
@LookupComponent("projectsDataGrid")
@DialogMode(width = "64em")
public class ProjectListView extends StandardListView<Project> {

    @Autowired
    private DialogWindows dialogWindows;
    @ViewComponent
    private DataGrid<Project> projectsDataGrid;

    @Subscribe("projectsDataGrid.showTasks")
    public void onProjectsDataGridShowTasks(final ActionPerformedEvent event) {
        DialogWindow<ProjectTasksView> dialogWindow = dialogWindows.view(this, ProjectTasksView.class).build();
        dialogWindow.getView().setProjectId(projectsDataGrid.getSingleSelectedItem());
        dialogWindow.setResizable(true);
        dialogWindow.open();
    }
}