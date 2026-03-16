package ru.cyberc3dr.jmixpm.view.timeentry;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ru.cyberc3dr.jmixpm.entity.TimeEntry;
import ru.cyberc3dr.jmixpm.view.main.MainView;


@Route(value = "time-entries", layout = MainView.class)
@ViewController(id = "pm_TimeEntry.list")
@ViewDescriptor(path = "time-entry-list-view.xml")
@LookupComponent("timeEntriesDataGrid")
@DialogMode(width = "64em")
public class TimeEntryListView extends StandardListView<TimeEntry> {
}