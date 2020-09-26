package us.friendsamong.discordbot.model.command.abstr;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import us.friendsamong.discordbot.model.command.Command;
import us.friendsamong.discordbot.model.ServiceRequest;

@RequiredArgsConstructor
public abstract class AbstractCommand<RQ extends ServiceRequest, RS> implements Command<RQ, RS>, InitializingBean {

    private final ApplicationContext context;

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public RS constrainedExecute(RQ request) {
        return this.execute(request);
    }

    public abstract RS execute(RQ request);
}
