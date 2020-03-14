package us.drillpvp.build;

import io.github.thatkawaiisam.assemble.Assemble;
import io.github.thatkawaiisam.assemble.AssembleStyle;
import lombok.Getter;
import us.drillpvp.build.scoreboard.BuildBoard;
import org.bukkit.plugin.java.JavaPlugin;

public class Build extends JavaPlugin {

	@Getter
	private static Build instance;

	@Override
	public void onEnable() {
		instance = this;

		System.out.println("[Build] Build Core has been Enabled.");
		registerAssemble();
	}

	@Override
	public void onDisable() {
		instance = null;

		System.out.println("[Build] Build Core has been Disabled.");
	}

	private void registerAssemble(){
		Assemble assemble = new Assemble(this, new BuildBoard());
		assemble.setAssembleStyle(AssembleStyle.KOHI);
		assemble.setTicks(2);
	}
}
