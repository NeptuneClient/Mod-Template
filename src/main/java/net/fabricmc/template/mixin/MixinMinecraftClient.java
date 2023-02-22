package net.fabricmc.template.mixin;

import net.fabricmc.template.ModTemplate;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {

    @Inject(method = "run", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/profiler/Recorder;startTick()V"))
    public void run(CallbackInfo ci) {
        // ModTemplate.LOGGER.info("Tick");
    }

}
