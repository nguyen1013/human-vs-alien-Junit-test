public class Environment {
    private int hitPoint;

    public void humanAttack(Human human, Alien alien) {
        this.hitPoint = 10;
        human.setHitTimes();
        alien.getAttack(hitPoint);
    }

    public void alienAttack(Alien alien, Human human) {
        this.hitPoint = 5;
        alien.setHitTimes();
        human.getAttack(hitPoint);
    }

}
