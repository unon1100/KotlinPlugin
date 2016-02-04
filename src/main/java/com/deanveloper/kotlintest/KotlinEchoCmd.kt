package com.deanveloper.kotlintest

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

/**
 * Echo Command
 *
 * @author Dean B
 */
object KotlinEchoCmd : CommandExecutor {
    override fun onCommand(sender: CommandSender?, cmd: Command?, lbl: String?, args: Array<out String>?): Boolean {
        sender!!.sendMessage("${args?.joinToString(separator=" ")}")

        return true
    }
}