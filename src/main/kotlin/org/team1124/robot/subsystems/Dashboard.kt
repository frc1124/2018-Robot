package org.team1124.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.PWMTalonSRX
import edu.wpi.first.networktables.NetworkTableInstance
import org.team1124.robot.Map

class Dashboard : Subsystem () {

  private val globalTable = NetworkTableInstance.create()
  private val visionTable = globalTable.getTable("vision")
  private val sensorTable = globalTable.getTable("sensor")
  private val errorsTable = globalTable.getTable("errors")

  override fun initDefaultCommand () = setDefaultCommand(null)
}