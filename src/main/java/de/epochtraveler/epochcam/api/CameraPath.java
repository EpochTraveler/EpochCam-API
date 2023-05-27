package de.epochtraveler.epochcam.api;

import org.bukkit.Location;

public interface CameraPath {

    /**
     * Get the point for the camera position
     * @return current or next camera point
     */
    Location getPoint();

    /**
     * Get the point number
     * @return Pointnumber
     */
    int getPointNumber();

}
