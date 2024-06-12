public class Human extends Species {
    private String speak;

    public Human(String name, int height, String speak) {
        super(name,height);
        this.speak = speak;
        this.setArmor(this.getArmor());
    }

    public String getSpeak() {
        return this.speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    @Override
    public String toString(){
        if (this.isAlive()) {
            return this.getName() + " is " + this.getHeight() + " in height and speak " + this.getSpeak();
        } else {
            return this.getName() + " is out of server!";
        }
    }

}
