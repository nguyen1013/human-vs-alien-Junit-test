public class Environment {
    private static int hitPoint;

    public static void humanAttack(Human human, Alien alien) {
        hitPoint = 10;
        human.setHitTimes();
        alien.getAttack(hitPoint);
    }

    public static void alienAttack(Alien alien, Human human) {
        hitPoint = 5;
        alien.setHitTimes();
        human.getAttack(hitPoint);
    }

}
