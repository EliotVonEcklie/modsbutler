package moe.eliotvonecklie.modsbutler;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.lifecycle.api.event.ServerLifecycleEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.loader.api.metadata.ModEnvironment;
import net.minecraft.client.MinecraftClient;

public class ModsbutlerMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Modsbutler");
	public static String MODID = "modsbutler";

	@Override
	public void onInitialize(ModContainer mod) {
		MODID = mod.metadata().id();
		
		ServerLifecycleEvents.STARTING.register(server -> {
		});
	}
}
