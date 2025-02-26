import java.util.List;
import java.util.ArrayList;

class Dungeon {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();
    private List<String> traps = new ArrayList<>();
    private List<String> secretPassages = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    public void addTrap(String trap) {
        traps.add(trap);
    }

    public void addSecretPassage(String passage) {
        secretPassages.add(passage);
    }

    @Override
    public String toString() {
        return "Dungeon: " + name + "\nRooms: " + rooms +
                "\nNPCs: " + npcs +
                "\nTraps: " + traps +
                "\nSecret Passages: " + secretPassages;
    }
}