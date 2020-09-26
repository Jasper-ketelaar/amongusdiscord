package us.friendsamong.discordbot.model;

import us.friendsamong.discordbot.model.command.Command;

public interface ServiceExecutor {

    <R extends ServiceRequest, T> T execute(Class<? extends Command<R, T>> commandClass, R request);

}
