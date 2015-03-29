package baymaxirc.examplemodule;

import baymaxirc.core.command.CommandManager;
import baymaxirc.core.event.IEventHandler;
import baymaxirc.core.module.IModule;

/**
 * @author shadowfacts
 */
public class ExampleModule implements IModule {

	@Override
	public String getName() {
		return "ExampleModule";
	}

	@Override
	public void registerCommands() {
		CommandManager.registerCommand(ExampleCommand.instance);
	}

	@Override
	public IEventHandler getEventHandler() {
		return ExampleEventHandler.instance;
	}
}
