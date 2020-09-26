package us.friendsamong.discordbot.model.command.type;

import net.dv8tion.jda.api.entities.GuildVoiceState;
import us.friendsamong.discordbot.model.command.Command;
import us.friendsamong.discordbot.model.impl.MuteRequest;

public interface MuteCommand extends Command<MuteRequest, GuildVoiceState> {
}
