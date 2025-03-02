package Assignment1;

interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addTrap(String trap);
    IDungeonBuilder addSecretPassage(String passage);
    Dungeon build();
}