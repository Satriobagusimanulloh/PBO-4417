import java.util.ArrayList;

import javax.management.monitor.GaugeMonitor;

public class GameEnvironment {
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    public GameEnvironment() {

    }
    public GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void addPlayer(GamePlayer tambahPlayer) {
        arrPlayer.add(tambahPlayer);
    }
    public void removePlayer(GamePlayer hapusPlayer) {
        arrPlayer.remove(hapusPlayer);
    }
    public void getAllPlayer() {
        System.out.println(arrPlayer);
    }
    public void addEnemy(GameEnemy tambaEnemy) {
        arrEnemy.add(tambaEnemy);
    }
    public void removeEnemy(GameEnemy hapusEnemy) {
        arrEnemy.remove(hapusEnemy);
    }
    public void getAllEnemy() {
        System.out.println(arrEnemy);
    }
    public void Interaction() {
        if (arrPlayer == null || arrEnemy == null) {
            System.out.println("Player or enemy not sets");
        }
        for (int i=0; i<arrPlayer.size(); i++){
            for (int j=0; j<arrEnemy.size(); j++){
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()) {
                    System.out.println("Player : " + arrPlayer.get(i) + " and Enemy : " + arrEnemy.get(j) + " Not in the same Y position");
                }
                if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2) {
                    System.out.println("Player : " + arrPlayer.get(i) + " attacked");
                    System.out.println("Enemy : " + arrEnemy.get(j) + " loses");
                    this.removeEnemy(arrEnemy.get(j));
                }
                else {
                    System.out.println("==> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("Current X position = " + arrPlayer.get(i).getX() + " <==");
                }
            } 
        } 
    }
    public static double EuclideanDistance(int X1, int Y1, int X2, int Y2) {
        return Math.sqrt(Math.pow(X2-X1, 2) + Math.pow(Y2-Y1, 2));
    }
}