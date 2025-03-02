package Assignment2;

class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }

    @Override
    public String toString() {
        return "Room{name='" + name + '\'' + ", description='" + description + '\'' + '}';
    }
}

class NPC implements CloneableGameEntity {
    private String name;
    private String description;
    private int health;

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.health);
    }

    @Override
    public String toString() {
        return "NPC{name='" + name + '\'' + ", description='" + description + '\'' + ", health=" + health + '}';
    }
}

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Treasure Room", "A room filled with gold and jewels.");
        NPC prototypeNPC = new NPC("Goblin", "A small, mischievous creature.", 50);

        Room clonedRoom = prototypeRoom.cloneEntity();
        NPC clonedNPC = prototypeNPC.cloneEntity();

        clonedRoom = new Room("Dark Chamber", "A dimly lit room with skeletons.");
        clonedNPC = new NPC("Orc", "A large, brutish warrior.", 100);

        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room: " + clonedRoom);

        System.out.println("Original NPC: " + prototypeNPC);
        System.out.println("Cloned NPC: " + clonedNPC);
    }
}

