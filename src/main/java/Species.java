public class Species {
    private String name;
    private int height;
    private boolean isAlive;
    private int armor;
    private int hitTimes;

    public Species(String name, int height) {
        this.name = name;
        this.height = height;
        this.isAlive = true;
        this.armor = 100;
        this.hitTimes = 20;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void getAttack(int hitPoints) {
        int i = Math.max(this.armor - hitPoints, 0);
        if (i==0) {
            this.setAlive(false);
        }
        this.setArmor(i);
    }

    public void setHitTimes() {
        this.hitTimes = Math.max(this.hitTimes - 1, 0);
    }

    public int getHitTimes() {
        return this.hitTimes;
    }

    @Override
    public String toString() {
        if (this.isAlive) {
            return  this.name + " is still alive with " + this.armor + " armor points";
        } else {
            return this.name + " has been out of server!";
        }
    }
}
