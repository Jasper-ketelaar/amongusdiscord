package us.friendsamong.discordbot.model.command.type.impl;

import net.dv8tion.jda.api.entities.GuildVoiceState;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import us.friendsamong.discordbot.model.impl.MuteRequest;
import us.friendsamong.discordbot.model.command.abstr.AbstractCommand;
import us.friendsamong.discordbot.model.command.type.MuteCommand;

@Component
public class MuteCommandImpl extends AbstractCommand<MuteRequest, GuildVoiceState> implements MuteCommand {

    public MuteCommandImpl(ApplicationContext context) {
        super(context);
    }

    @Override
    public GuildVoiceState execute(MuteRequest request) {
        request.getToMute().mute(true).queue();
        return request.getToMute().getVoiceState();
    }
}
