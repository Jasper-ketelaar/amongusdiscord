package us.friendsamong.discordbot.model.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import us.friendsamong.discordbot.model.command.Command;
import us.friendsamong.discordbot.model.ServiceExecutor;
import us.friendsamong.discordbot.model.ServiceRequest;

@Component
@RequiredArgsConstructor
public class DefaultServiceExecutor implements ServiceExecutor {

    private final ApplicationContext context;

    @Override
    public <R extends ServiceRequest, T> T execute(Class<? extends Command<R, T>> commandClass, R request) {
        Command<R, T> command = context.getBean(commandClass);
        return command.constrainedExecute(request);
    }
}
