package baymaxirc.examplemodule;

import baymaxirc.core.event.IEventHandler;
import org.pircbotx.hooks.events.JoinEvent;

/**
 * @author shadowfacts
 */
public class ExampleEventHandler implements IEventHandler {

	public static ExampleEventHandler instance = new ExampleEventHandler();

	@Override
	public void handleJoin(JoinEvent event) {
		event.respond("o/ " + event.getUser().getNick());
	}
}
