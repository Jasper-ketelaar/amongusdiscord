package us.friendsamong.discordbot.model.impl;

import lombok.Data;
import net.dv8tion.jda.api.entities.Member;
import us.friendsamong.discordbot.model.ServiceRequest;

@Data
public class MuteRequest implements ServiceRequest {

    private Member toMute;

}

