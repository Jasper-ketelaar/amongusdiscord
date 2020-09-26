package us.friendsamong.discordbot.listener;

import lombok.RequiredArgsConstructor;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import us.friendsamong.discordbot.model.ServiceExecutor;

@Controller
@RequiredArgsConstructor
public class ChatMessageListener extends ListenerAdapter {

    private final ServiceExecutor executor;

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

    }
}
