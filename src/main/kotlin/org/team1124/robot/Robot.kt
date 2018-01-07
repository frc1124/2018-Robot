package org.team1124.robot

import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler
import org.team1124.robot.subsystems.Chassis
import org.team1124.robot.subsystems.Dashboard

class Robot : IterativeRobot () {

  companion object {
    public val dashboard = Dashboard()
    public val chassis = Chassis()
  }

  override fun robotInit () {}
  override fun autonomousInit () {}
  override fun teleopInit () {}

  override fun autonomousPeriodic () = Scheduler.getInstance().run()
  override fun teleopPeriodic () = Scheduler.getInstance().run()
}