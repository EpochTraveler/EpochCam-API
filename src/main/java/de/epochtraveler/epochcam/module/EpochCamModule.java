package de.epochtraveler.epochcam;

import de.epochtraveler.epochapi.CoreServer;
import de.epochtraveler.epochapi.modules.Module;
import de.epochtraveler.epochapi.modules.ModuleDescription;

@ModuleDescription(
        name = "EpochCam-Module",
        version = "1.0.0"
)
public final class EpochCamModule extends Module {

    public EpochCamModule(CoreServer server) {
        super(server);
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }
}
