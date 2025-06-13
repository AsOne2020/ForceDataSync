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

package me.asone.forcedatasync.mixins.minihud;

import me.fallenbreath.conditionalmixin.api.annotation.Condition;
import me.fallenbreath.conditionalmixin.api.annotation.Restriction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("UnresolvedMixinReference")
@Restriction(require = @Condition(value = "minihud",versionPredicates = ">=0.34.4"))
@Pseudo
@Mixin(targets = "fi.dy.masa.minihud.data.EntitiesDataManager")
public abstract class MixinEntitiesDataManager {
    @Inject(method = "shouldUseQuery", remap = false, at = @At(value = "RETURN"), cancellable = true)
    private void shouldUseQuery(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
