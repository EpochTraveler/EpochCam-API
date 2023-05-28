package de.epochtraveler.epochcam.api;

import de.epochtraveler.epochcam.api.builder.CameraBuilder;

public class EpochCamAPI {

    private static EpochCamAPILocal apiLocal;

    public EpochCamAPI(EpochCamAPILocal local) {
        EpochCamAPI.apiLocal =  local;
    }

    public static CameraBuilder createCamera() {
        return apiLocal.createCamera();
    }

}
