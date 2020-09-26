package us.friendsamong.discordbot.resolver.types.impl;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import us.friendsamong.discordbot.model.impl.MuteRequest;
import us.friendsamong.discordbot.resolver.types.ChatMessageResolver;

public class MuteResolver implements ChatMessageResolver<MuteRequest> {

    @Override
    public MuteRequest resolve(MessageReceivedEvent event) {
        return null;
    }
}
