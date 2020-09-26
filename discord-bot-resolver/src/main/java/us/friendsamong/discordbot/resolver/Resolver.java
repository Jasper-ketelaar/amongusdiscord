package us.friendsamong.discordbot.resolver;

import net.dv8tion.jda.api.events.GenericEvent;
import us.friendsamong.discordbot.model.ServiceRequest;

public interface Resolver<T extends GenericEvent, K extends ServiceRequest> {

    K resolve(T event);

}
