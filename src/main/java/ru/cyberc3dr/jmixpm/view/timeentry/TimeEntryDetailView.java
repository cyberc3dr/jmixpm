package ru.cyberc3dr.jmixpm.view.timeentry;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.cyberc3dr.jmixpm.entity.TimeEntry;
import ru.cyberc3dr.jmixpm.view.main.MainView;

@Route(value = "time-entries/:id", layout = MainView.class)
@ViewController(id = "pm_TimeEntry.detail")
@ViewDescriptor(path = "time-entry-detail-view.xml")
@EditedEntityContainer("timeEntryDc")
public class TimeEntryDetailView extends StandardDetailView<TimeEntry> {
}