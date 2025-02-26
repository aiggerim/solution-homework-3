public class MUDBuilderDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();

        Room room1 = new Room("Entrance Hall", "A grand hall with flickering torches.");
        Room room2 = new Room("Treasure Room", "A room filled with gold and jewels.");

        NPC boss = new NPC("Dragon", 500);
        NPC minion = new NPC("Goblin", 50);

        Dungeon dungeon = builder.setDungeonName("Mystic Caverns")
                .addRoom(room1)
                .addRoom(room2)
                .addNPC(boss)
                .addNPC(minion)
                .addTrap("Poison Dart Trap")
                .addTrap("Pitfall Trap")
                .addSecretPassage("Hidden tunnel behind the statue")
                .build();

        System.out.println(dungeon);
    }
}