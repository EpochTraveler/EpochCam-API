package de.epochtraveler.epochcam.api;

import de.epochtraveler.epochcam.api.builder.CameraBuilder;

public interface EpochCamAPILocal {

    /**
     * Creates a new camera builder
     * @return camera-builder instance
     */
    CameraBuilder createCamera();

}
