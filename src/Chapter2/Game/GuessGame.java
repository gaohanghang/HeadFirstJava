package Chapter2.Game;

public class GuessGame {
    //用3个实例变量分别表示3个Player对象
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        //创建出Player对象
        p1 =new Player();
        p2 =new Player();
        p3 =new Player();

        //声明三个变量来保存猜测的数字
        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        //声明3个变量来保存是否猜中
        boolean p1isRight =false;
        boolean p2isRight =false;
        boolean p3isRight =false;

        //产生谜底数字
        int targetNumber=(int)(Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");



    }
}
