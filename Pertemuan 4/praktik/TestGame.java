public class TestGame {
    public static void main(String[] args) {
        GamePlayer hero = new GamePlayer();
        hero.setDimension(12, 12);
        hero.setPosition(10, 220);
        System.out.println("Posisi Player " + hero.getX() + ", " + hero.getY());
        hero.Run(12);
        System.out.println("Posisi Player " + hero.getX() + ", " + hero.getY());
        GamePlayer hero2 = new GamePlayer();
        hero2.setDimension(12, 32);
        hero.setPosition(10, 10);

        GameEnemy monster = new GameEnemy();
        monster.setDimension(12, 32);
        monster.setPosition(10, 10);

        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(hero);
        scene.addPlayer(hero);
        scene.addPlayer(hero2);
        scene.getAllPlayer();
        scene.removePlayer(hero);
        scene.getAllPlayer();
        scene.addEnemy(monster);
        scene.Interaction();
    }
}