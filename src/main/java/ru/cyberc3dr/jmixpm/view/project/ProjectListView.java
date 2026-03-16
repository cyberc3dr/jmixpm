package ru.cyberc3dr.jmixpm.view.project;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ru.cyberc3dr.jmixpm.entity.Project;
import ru.cyberc3dr.jmixpm.view.main.MainView;


@Route(value = "projects", layout = MainView.class)
@ViewController(id = "pm_Project.list")
@ViewDescriptor(path = "project-list-view.xml")
@LookupComponent("projectsDataGrid")
@DialogMode(width = "64em")
public class ProjectListView extends StandardListView<Project> {
}