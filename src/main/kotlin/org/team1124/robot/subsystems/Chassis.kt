package org.team1124.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.PWMTalonSRX
import org.team1124.robot.Map
import org.team1124.robot.commands.ArcadeDrive

class Chassis : Subsystem () {

  private val leftSpeedController = PWMTalonSRX(Map.leftControllerChannel)
  private val rightSpeedController = PWMTalonSRX(Map.rightControllerChannel)

  override fun initDefaultCommand () = setDefaultCommand(ArcadeDrive())
}