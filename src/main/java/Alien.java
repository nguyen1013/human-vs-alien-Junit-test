public class Alien extends Species{
    private String superPower;

    public Alien(String name, int height, String superPower) {
        super(name, height);
        this.superPower = superPower;
        this.setArmor(this.getArmor() + 50);
    }

    public String getSuperPower() {
        return this.superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString(){
        if (this.isAlive()) {
            return this.getName() + " is " + this.getHeight() + " in height and has special power is " + this.getSuperPower();
        } else {
            return this.getName() + " is out of server!";
        }
    }

}
