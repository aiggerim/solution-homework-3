class NPC {
    private String name;
    private int health;

    public NPC(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + ")";
    }
}