package com.example.system;

public class ActualSystemImplementation implements SystemInterface {
    private boolean systemState = true;

    @Override
    public String performOperation(String input) {
        // Simple implementation that processes input
        return "Processed: " + input;
    }

    @Override
    public boolean validateSystem() {
        return systemState;
    }

    @Override
    public String getSystemStatus() {
        return systemState ? "System Operational" : "System Offline";
    }
}