package de.epochtraveler.epochcam.api;

import de.epochtraveler.epochcam.api.builder.CameraBuilder;

public interface EpochCamAPILocal {

    /**
     * Creates a new camera builder
     * @return camera-builder instance
     */
    CameraBuilder createCamera();

    /**
     * Get the camera object from the ID
     * @param id Camera-ID
     * @return Camera
     */
    Camera getCamera(String id);

}
