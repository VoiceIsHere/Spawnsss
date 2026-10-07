package VoiceIsHere.spawn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class SetSpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (!(commandSender instanceof Player player)){
            commandSender.sendMessage("Only players can execute this command!");
            return true;

        }
        getConfig().set("spawn", player.getLocation());
        saveConfig();
        player.sendMessage("Spawn set!");
        return true;




        return true;
    }

    }
