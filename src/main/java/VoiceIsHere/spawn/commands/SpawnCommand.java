package VoiceIsHere.spawn.commands;

import org.bukkit.Location;
import org.bukkit.World;
import VoiceIsHere.spawn.commands.SetSpawnCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (!(commandSender instanceof Player )){
            commandSender.sendMessage("Only players can execute this command!");
            return true;

    }

        Location spawn = (Location) new SetSpawnCommand().getConfig().get("spawn");
        Player player = (Player) commandSender;
        if (spawn == null){
            player.sendMessage("Spawn is not set!");
            return true;
        }
        player.sendTitle
(" ","You have been teleported to spawn!", 20, 40, 20);

        player.teleport(spawn);
        return true;
    }
}
