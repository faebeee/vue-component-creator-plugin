package io.fabs.vue.vuex;


import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import io.fabs.util.settings.AbstractPersistentState;
import io.fabs.vue.vuex.widget.VuexCreateOptions;

@State(
        name = "VuexSettings",
        storages = {
                @Storage("/vcc.xml")
        }
)
public class VuexSettingsState extends AbstractPersistentState<VuexCreateOptions> {

    public VuexSettingsState() {
        super(new VuexCreateOptions());
    }

    public static VuexSettingsState getInstance(Project project) {
        return ServiceManager.getService(project, VuexSettingsState.class);
    }

}
