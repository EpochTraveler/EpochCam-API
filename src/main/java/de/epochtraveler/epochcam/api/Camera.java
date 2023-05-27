package de.epochtraveler.epochcam.api;

import java.util.List;

public interface Camera {

    /**
     * Get the camera-id
     * @return camera id
     */
    String getCameraId();

    /**
     * Play the camera shot
     */
    void play();

    /**
     * Pauses the camera shot
     */
    void pause();

    /**
     * Stop the camera shot
     */
    void stop();

    /**
     * Restart the cam footage
     */
    void restart();

    List<?> getCameraPath();

}
