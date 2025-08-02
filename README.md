# ForceDataSync

[![License](https://img.shields.io/github/license/AsOne2020/ForceDataSync.svg)](http://www.gnu.org/licenses/lgpl-3.0.html)
[![Issues](https://img.shields.io/github/issues/AsOne2020/ForceDataSync.svg)](https://github.com/AsOne2020/ForceDataSync/issues)

A client-side mod that bypasses permission checks for Tweakeroo/MiniHUD/Litematica/Tweakermore mods to enable data synchronization features

## About

ForceDataSync is a client-side mod designed to solve the permission inconsistency issue between client and server. While the DataSyncer server plugin allows players to query data, client-side mods such as Tweakeroo, Litematica, MiniHUD, and Tweakermore perform local permission checks (requiring permission level 2 or higher) before enabling data synchronization features.

ForceDataSync addresses this permission check inconsistency by bypassing the local permission checks of these client mods, allowing these features to function properly without requiring operator permissions on the server.

> **Synergy with DataSyncer Plugin**:
> - If you are a server administrator, you can install the [DataSyncer plugin](https://modrinth.com/plugin/datasyncer) on the server side to provide data synchronization support
> - If you are a regular player, you can install the ForceDataSync mod to bypass local permission checks and fully utilize the functions provided by the DataSyncer plugin

## Supported Mods

- **Tweakeroo** - Various gameplay enhancements
- **MiniHUD** - Heads-up display with customizable information
- **Litematica** - Schematic and building helper mod
- **Tweakermore** - Additional features and improvements for Tweakeroo

## Installation

1. Download the appropriate version of ForceDataSync for your Minecraft version
2. Place the mod file in your `mods` folder
3. Launch Minecraft with Fabric loader

## Recommended Configuration

To fully utilize the capabilities enabled by ForceDataSync, the following settings are recommended in the respective mods:

### Tweakeroo Mod
**Tweaks Category:**
- `tweakServerDataSync` - **Enable** (Server data synchronization feature)
- `tweakServerDataSyncBackup` - **Enable** (Server data synchronization backup feature)

### Litematica Mod
**Generic Category:**
- `entityDataSync` - **Enable** (Entity data synchronization feature)
- `entityDataSyncBackup` - **Enable** (Entity data synchronization backup feature)

**Info Overlay Category:**
- `blockInfoOverlayEnabled` - **Enable** (Block information overlay display)
  - **Shortcut Key Usage Prerequisite**: This option must be enabled before the `I` key can be used to view block information

### MiniHUD Mod
**Generic Category:**
- `entityDataSync` - **Enable** (Entity data synchronization feature)
- `entityDataSyncBackup` - **Enable** (Entity data synchronization backup feature)
- `inventoryPreviewEnabled` - **Enable** (Container preview feature)
  - **Shortcut Key Usage Prerequisite**: This option must be enabled before the `Alt` key can be used to preview container contents

### Tweakermore Mod
- `serverDataSyncer` - **Enable** (Server data syncer feature)

**Parameter Settings:**
- `serverDataSyncerQueryInterval` - Set to `1` (Fastest query interval)
- `serverDataSyncerQueryLimit` - Set to `25` (Reasonable query quantity limit)
  - **Note**: Users can adjust these parameters according to server conditions. If set too high, players may be kicked by the server for sending too many packets.

## Compatibility

ForceDataSync is compatible with:
- Minecraft 1.21.x
- Fabric mod loader
- Tweakeroo, MiniHUD, Litematica, and Tweakermore mods
