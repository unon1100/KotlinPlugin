package com.deanveloper.kotlintest.command

import com.deanveloper.kotlintest.KotlinPlayerData
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

/**
 * Sets a boolean for player data
 *
 * @author Dean B
 */
object KotlinSillyCmd : CommandExecutor {
    override fun onCommand(sender: CommandSender, cmd: Command, lbl: String, args: Array<out String>): Boolean {
        assert(sender is Player)
        val data = KotlinPlayerData[(sender as Player).uniqueId]!!
        data.silly = !data.silly
        sender.sendMessage("You are now${if(!data.silly) " not" else ""} silly!")
        return false;
    }
}