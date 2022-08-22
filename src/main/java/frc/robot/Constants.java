// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    public static final class Drive {
        /* Motors */
	// 	public static final TalonConstants leftParent = 
    //         new TalonConstants(1, talonCurrentLimit.supplyCurLim40, NeutralMode.Brake, InvertType.None);
    
    //  public static final TalonConstants leftChild = 
    //         new TalonConstants(2, talonCurrentLimit.supplyCurLim40, NeutralMode.Brake, InvertType.FollowMaster);

    //  public static final TalonConstants rightParent = 
    //         new TalonConstants(3, talonCurrentLimit.supplyCurLim40, NeutralMode.Brake, InvertType.InvertMotorOutput);
            
    //  public static final TalonConstants rightChild = 
    //         new TalonConstants(4, talonCurrentLimit.supplyCurLim40, NeutralMode.Brake, InvertType.FollowMaster);
        
        public static final int leftParentID = 0;  // change when we find the real ids
        public static final int leftChildID = 0;   // change when we find the real ids
        public static final int rightParentID = 0; // change when we find the real ids
        public static final int rightChildID = 0;  // change when we find the real ids

        /* Joystick IDs */

        public static final int LY_AXIS = 0;  // change when we find the real ids
        public static final int RX_AXIS = 0;  // change when we find the real ids

    }

    public static final class Shooter {

        public static final int shooterID = 0;  // change when we find the real ids
    }

    public static final class Intake {

        public static final double intakePower = 0.1; // MUST TEST AND REFINE
        public static final double outtakePower = -0.1; //MUST TEST AND REFINE
        // public static final int intakeArmID = 0;  // change when we find the real ids

        // Arm Controls
        public static final double armHoldUp = 0.08;
        public static final double armHoldDown = 0.13;
        public static final double armTravel = 0.5;
        public static final double armTimeUp = 0.5;
        public static final double armTimeDown = 0.35;
        public static final boolean armUp = true;

    }
    
}
