package org.team1124.robot.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1124.robot.Robot

class ArcadeDrive : Command () {

  init { requires(Robot.chassis) }

  override fun isFinished () = false
  override fun execute () {
    
  }
}