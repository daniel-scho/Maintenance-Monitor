package com.atd.maintenance_monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceControllerTest {
    MaintenanceController maintenanceController = new MaintenanceController();

    @Test
    void changeStateTest(){
        // Arrange
        String input = "reset";
        String expected = "green";
        // Act
        String output = maintenanceController.changeState(input);
        // Assert
        assertEquals(expected, output);
    }
    @Test
    void changeStateTest2(){
        // Arrange
        String input = "string";
        String expected = "red";
        // Act
        String output = maintenanceController.changeState(input);
        // Assert
        assertEquals(expected, output);
    }
    @Test
    void changeStateTestEmpty(){
        // Arrange
        String input = "";
        String expected = "red";
        // Act
        String output = maintenanceController.changeState(input);
        // Assert
        assertEquals(expected, output);
    }
    @Test
    void changeStateTestSpace(){
        // Arrange
        String input = " ";
        String expected = "red";
        // Act
        String output = maintenanceController.changeState(input);
        // Assert
        assertEquals(expected, output);
    }

    @Test
    void initialStateTest(){
        // Arrange
        String expected = "green";
        // Act
        String output = maintenanceController.initialState();
        // Assert
        assertEquals(expected, output);
    }
}