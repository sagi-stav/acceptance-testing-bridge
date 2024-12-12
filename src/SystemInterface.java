package com.example.system;

/**
 * Known Interface representing the system contract
 * This interface defines the core operations that must be implemented
 */
public interface SystemInterface {
    /**
     * Perform a core operation with input and expected output
     * @param input The input for the operation
     * @return The result of the operation
     */
    String performOperation(String input);

    /**
     * Validate if the system is in a correct state
     * @return true if system is valid, false otherwise
     */
    boolean validateSystem();

    /**
     * Get the current system status
     * @return A description of the current system status
     */
    String getSystemStatus();
}