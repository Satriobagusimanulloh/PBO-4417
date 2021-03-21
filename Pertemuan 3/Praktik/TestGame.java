public class TestGame {
    public static void main(String[] args) {
        GamePlayer player1 = new GamePlayer();
        player1.setDimension(10, 5);
        player1.setPosition(60, 60);
        System.out.println("Width "+player1.getWidth()+" Height "+player1.getHeight()+" X position "+player1.getX()+" Y position "+player1.getY());
        player1.Run();
        player1.Run(30);

        GamePlayer player2 = new GamePlayer(20, 10, 30, 30);
        System.out.println("Width "+player2.getWidth()+" Height "+player2.getHeight()+" X position "+player2.getX()+" Y position "+player2.getY());
        player2.Run();
        player2.Run(15);

        GameEnemy enemy1 = new GameEnemy();
        enemy1.setDimension(10, 10);
        enemy1.setPosition(60, 60);
        System.out.println("Width "+enemy1.getWidth()+" Height "+enemy1.getHeight()+" X position "+enemy1.getX()+" Y position "+enemy1.getY());
        enemy1.Run();

        GameEnemy enemy2 = new GameEnemy(20, 20, 120, 90);
        System.out.println("Width "+enemy2.getWidth()+" Height "+enemy2.getHeight()+" X position "+enemy2.getX()+" Y position "+enemy2.getY());
    }
}