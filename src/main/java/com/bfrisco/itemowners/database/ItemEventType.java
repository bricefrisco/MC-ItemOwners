package com.bfrisco.itemowners.database;

public enum ItemEventType {
    INVENTORY_TO_CURSOR,
    STORAGE_TO_CURSOR,
    TO_INVENTORY,
    TO_STORAGE,
    TO_ENDER_CHEST,
    TO_PLAYER_VAULT,

    TO_INVENTORY_BY_UNKNOWN,
    TO_STORAGE_BY_UNKNOWN,

    DROPPED_ON_DEATH_BY_PLAYER,
    DROPPED_BY_PLAYER,
    PICKED_UP_BY_PLAYER,
    PICKED_UP_BY_ENTITY,

    DESPAWNED,
    DAMAGED,
    BROKE,
    DISPOSED,
    CLEARED_INVENTORY,
    SALVAGED,

    TRADED,
    GRINDED
}
