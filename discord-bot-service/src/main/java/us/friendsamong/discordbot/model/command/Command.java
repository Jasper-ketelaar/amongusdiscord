package us.friendsamong.discordbot.model.command;

import us.friendsamong.discordbot.model.ServiceRequest;

public interface Command<RQ extends ServiceRequest, RS> {

    RS constrainedExecute(RQ request);

}
