package de.epochtraveler.epochcam.api;

import de.epochtraveler.epochapi.api.API;
import de.epochtraveler.epochcam.api.builder.CameraBuilder;

@API(
        name = "EpochCam-API",
        version = "1.0.3"
)
public class EpochCamAPI {

    private static EpochCamAPILocal apiLocal;

    public EpochCamAPI(EpochCamAPILocal local) {
        EpochCamAPI.apiLocal =  local;
    }

    public static CameraBuilder createCamera() {
        return apiLocal.createCamera();
    }

}
