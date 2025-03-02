package Assignment1;

class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon = new Dungeon();

    public IDungeonBuilder setDungeonName(String name) {
        dungeon.setName(name);
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        dungeon.addRoom(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        dungeon.addNPC(npc);
        return this;
    }

    public IDungeonBuilder addTrap(String trap) {
        dungeon.addTrap(trap);
        return this;
    }

    public IDungeonBuilder addSecretPassage(String passage) {
        dungeon.addSecretPassage(passage);
        return this;
    }

    public Dungeon build() {
        return dungeon;
    }
}