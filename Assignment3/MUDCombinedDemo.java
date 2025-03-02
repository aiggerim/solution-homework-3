package Assignment3;

import Assignment1.SimpleDungeonBuilder;
import Assignment1.Dungeon;
import Assignment2.Room;
import Assignment2.NPC;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();

        Room treasureRoom = new Room("Treasure Room", "A room full of gold and jewels.");
        Room entranceHall = new Room("Entrance Hall", "A grand hall with flickering torches.");

        NPC boss = new NPC("Dragon", 500);
        NPC minion = new NPC("Goblin", 50);

        Dungeon dungeon = builder.setDungeonName("Mystic Caverns")
                .addRoom(entranceHall)
                .addNPC(boss)
                .addNPC(minion)
                .build();

        System.out.println("Original Dungeon:");
        System.out.println(dungeon);

        for (int i = 1; i <= 3; i++) {
            Room clonedRoom = treasureRoom.cloneEntity();
            clonedRoom.setName(treasureRoom.getName() + " Clone #" + i);
            dungeon.addRoom(clonedRoom);
        }

        System.out.println("\nDungeon after adding cloned rooms:");
        System.out.println(dungeon);
    }
}

