package frc.robot.auton;

public class AutonConstants {


    //Field measurements - DO NOT TWEAK. THESE ARE FACTS.
    //Distance from the side of the ship to the long side of the field
    public static final double SHIP_TO_LONGSIDE = 133.13;

    //Distance from the center of the loading station to the long side of the field
    public static final double LOADINGSTATION_TO_LONGSIDE = 27.44;

    //Distance from front of Hab2 to the center of Bay1 (tape)
    public static final double HAB2_TO_BAY1=212.80;

    // Distance between bays
    public static final double CARGO_BAY1_TO_BAY2 = 21.75;
    public static final double CARGO_BAY1_TO_BAY3 = 43.5;

    //Distance from Hab1 to reach the Bay1 of the ship
    public static final double HAB1_CARGOSHIP_BAY1_TOTAL_DISTANCE = 195.33;

    // TODO: maybe fix this
    // previously, it was the same distance as HAB1_CARGOSHIP_BAY1_TOTAL_DISTANCE
    //Distance from Hab1 to reach the Bay2 of the ship
    public static final double HAB1_CARGOSHIP_BAY2_TOTAL_DISTANCE = HAB1_CARGOSHIP_BAY1_TOTAL_DISTANCE + CARGO_BAY1_TO_BAY2;

    // TODO: maybe fix this one too
    // previously, it was the same distance as HAB1_CARGOSHIP_BAY1_TOTAL_DISTANCE
    //Distance from Hab1 to reach the Bay3 of the ship
    public static final double HAB1_CARGOSHIP_BAY3_TOTAL_DISTANCE = HAB1_CARGOSHIP_BAY1_TOTAL_DISTANCE + CARGO_BAY1_TO_BAY3;

    //What we decided to use.  Tweak as necessary based on observation
    //Distance robot to drive straight before making a turn.  
    //The ship is close to the path so have to appraoch at angle in order to turn
    public static final double HAB1_CARGOSHIP_DISTANCE_BEFORE_TURN = 100;
    // The total here would be the difference between the distance of hab2<->1 and the hab1 cargoship distance between turn
    public static final double HAB2_CARGOSHIP_DISTANCE_BEFORE_TURN = HAB1_CARGOSHIP_DISTANCE_BEFORE_TURN + (HAB2_TO_BAY1 - HAB1_CARGOSHIP_BAY1_TOTAL_DISTANCE);
 
    //How much angle to turn on our way to the ship
    public static final int HAB_TO_BAY_ANGLE = 15;

    //How much angle to turn to face the rocket after hatch panel pick up at loading station
    public static final int LOADING_TO_SHIP_ANGLE = 180;

    //Width of the robot
    public static final double ROBOT_WIDTH = 35;
 
    //Length of the robot
    public static final double ROBOT_LENGTH = 35;

    //Distance robot will back up after delivery of hatchpanel or cargo
    public static final double BACKUP_AFTER_DELIVERY = 24;

    //Distance robot will back up after pickup of hatchpanel
    public static final double BACKUP_AFTER_PICKUP = 24;
}

