package io.github.toydotgame.SetWorldSpawn;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {	
	@Override
	public void onEnable() {
		this.getCommand("setworldspawn").setExecutor(new GMC());
		System.out.print("[SWS] Plugin loaded successfully!");
	}
}
