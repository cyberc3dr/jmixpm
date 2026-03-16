package ru.cyberc3dr.jmixpm.view.project;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.cyberc3dr.jmixpm.entity.Project;
import ru.cyberc3dr.jmixpm.view.main.MainView;

@Route(value = "projects/:id", layout = MainView.class)
@ViewController(id = "pm_Project.detail")
@ViewDescriptor(path = "project-detail-view.xml")
@EditedEntityContainer("projectDc")
public class ProjectDetailView extends StandardDetailView<Project> {
}