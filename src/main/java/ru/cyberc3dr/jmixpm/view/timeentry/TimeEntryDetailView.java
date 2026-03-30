package ru.cyberc3dr.jmixpm.view.timeentry;

import com.vaadin.flow.router.Route;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import ru.cyberc3dr.jmixpm.entity.TimeEntry;
import ru.cyberc3dr.jmixpm.entity.User;
import ru.cyberc3dr.jmixpm.view.main.MainView;

import java.time.LocalDateTime;

@Route(value = "time-entries/:id", layout = MainView.class)
@ViewController(id = "pm_TimeEntry.detail")
@ViewDescriptor(path = "time-entry-detail-view.xml")
@EditedEntityContainer("timeEntryDc")
public class TimeEntryDetailView extends StandardDetailView<TimeEntry> {

    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<TimeEntry> event) {
        final User user = (User) currentAuthentication.getUser();
        TimeEntry newEntry = event.getEntity();

        newEntry.setUser(user);
        newEntry.setEntryDate(LocalDateTime.now().withHour(12).withMinute(0));
    }
}