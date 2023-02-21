package net.fabricmc.template.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntityRenderer.class})
public class MixinLivingEntityRenderer<T extends Entity> {
    @Inject(at = @At("HEAD"), method = "hasLabel(Lnet/minecraft/entity/LivingEntity;)Z", cancellable = true)
    private void showName(LivingEntity ent, CallbackInfoReturnable<Boolean> ci) {
      //  MinecraftClient.getInstance().getTextureManager().bindTexture(new ResourceLocation("ciapo", "neptune/logo/512x512.png"));
       // Gui.drawModalRectWithCustomSizedTexture(-fontrenderer.getStringWidth(ent.getDisplayName()) / 2 - 12, -2, 10, 10, 10, 10, 10, 10);
        if (ent == MinecraftClient.getInstance().cameraEntity) {
            ci.setReturnValue(MinecraftClient.isHudEnabled());
        }
    }
}
