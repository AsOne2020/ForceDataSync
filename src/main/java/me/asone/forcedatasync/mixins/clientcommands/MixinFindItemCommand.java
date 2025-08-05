/*
 * This file is part of the ForceDataSync project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2025  As_One and contributors
 *
 * ForceDataSync is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ForceDataSync is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ForceDataSync.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.asone.forcedatasync.mixins.clientcommands;

import me.fallenbreath.conditionalmixin.api.annotation.Condition;
import me.fallenbreath.conditionalmixin.api.annotation.Restriction;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@SuppressWarnings("UnresolvedMixinReference")
@Restriction(require = @Condition(value = "clientcommands", versionPredicates = ">=2.8.4"))
@Pseudo
@Mixin(targets = "net.earthcomputer.clientcommands.command.FindItemCommand")
public abstract class MixinFindItemCommand {
    @Redirect(method = "makeFindItemsTask", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_746;method_64475(I)Z"), remap = false)
    private static boolean redirecthasPermissionLevel(ClientPlayerEntity instance, int level) {
        return true;
    }
}