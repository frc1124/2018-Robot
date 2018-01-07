package org.team1124.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.PWMTalonSRX
import edu.wpi.first.networktables.NetworkTable
import org.team1124.robot.Map

class Dashboard : Subsystem () {

  //private val visionTable = NetworkTable.getTable("vision")
  //private val sensorTable = NetworkTable.getTable("sensor")
  //private val errorsTable = NetworkTable.getTable("errors")

  override fun initDefaultCommand () = setDefaultCommand(null)
}