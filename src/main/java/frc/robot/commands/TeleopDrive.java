// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class TeleopDrive extends CommandBase {
  /** Creates a new TeleopDrive. */
  private final DriveTrain drive;
  private final Joystick pilot;
  
  public TeleopDrive(DriveTrain drive, Joystick pilotController) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drive = drive;
    pilot = pilotController;
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftStickY = pilot.getRawAxis(Constants.Drive.LY_AXIS);
    double rightStickX = pilot.getRawAxis(Constants.Drive.RX_AXIS);

    drive.setLeftMotors(leftStickY + rightStickX);
    drive.setRightMotors(leftStickY - rightStickX);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}