
package net.eduard.template;

import org.bukkit.plugin.java.JavaPlugin;

import net.eduard.api.server.EduardPlugin;
import net.eduard.template.command.TemplateCommand;
import net.eduard.template.event.TemplateEvents;

public class Main extends EduardPlugin  {
	private static Main plugin;
	public static Main getInstance() {
		return plugin;
	}
	public static Main getPlugin() {
		return JavaPlugin.getPlugin(Main.class);
	}
	@Override
	public void onEnable() {
		plugin = this;
		
		reload();
		new TemplateEvents().register(this);
		new TemplateCommand().register();
	}
	public void save() {
		
	}
	public void reload() {
		
	}
	@Override
	public void onDisable() {
		save();
	}

}
