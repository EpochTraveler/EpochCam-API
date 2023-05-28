package de.epochtraveler.epochcam.api.builder;

import de.epochtraveler.epochcam.api.Camera;
import de.epochtraveler.epochcam.api.CameraPath;

public interface CameraBuilder {

    /**
     * Set the camera-id
     */
    CameraBuilder setCameraId();

    /**
     * Add a new camera point
     * @param point camera point
     */
    CameraBuilder addCameraPoint(CameraPath point);

    /**
     * Saves the current camera
     */
    Camera save();

}
