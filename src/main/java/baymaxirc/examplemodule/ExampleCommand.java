package baymaxirc.examplemodule;

import baymaxirc.core.command.ICommand;
import org.pircbotx.hooks.types.GenericMessageEvent;

import java.util.ArrayList;

/**
 * @author shadowfacts
 */
public class ExampleCommand implements ICommand {

	public static ExampleCommand instance = new ExampleCommand();

	@Override
	public String getCommandName() {
		return "example";
	}

	@Override
	public void execute(ArrayList<String> args, GenericMessageEvent event) {
		event.respond("This is an example command! The first parameter was:");
		event.respond(args.get(0));
	}

	@Override
	public void help(GenericMessageEvent event) {
		event.respond("This is the help for an example command!");
	}
}
