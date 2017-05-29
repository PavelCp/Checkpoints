package com.november.myapplication;

/**
 * Created by November on 29.05.2017.
 */

public class Checkpoint {
    private String checkpointName;
    private String checkpointStatus;

    public Checkpoint(String checkpointName, String checkpointStatus) {
        setCheckpointName(checkpointName);
        setCheckpointStatus(checkpointStatus);
    }

    public String getCheckpointName() {
        return checkpointName;
    }

    public void setCheckpointName(String checkpointName) {
        this.checkpointName = checkpointName;
    }

    public String getCheckpointStatus() {
        return checkpointStatus;
    }

    public void setCheckpointStatus(String checkpointStatus) {
        this.checkpointStatus = checkpointStatus;
    }
}
