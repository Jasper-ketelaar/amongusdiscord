package us.friendsamong.discordbot.resolver.types;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import us.friendsamong.discordbot.model.ServiceRequest;
import us.friendsamong.discordbot.resolver.Resolver;

public interface ChatMessageResolver<T extends ServiceRequest> extends Resolver<MessageReceivedEvent, T> {

}
