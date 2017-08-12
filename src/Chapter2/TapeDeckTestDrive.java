package Chapter2;


class TapeDeck   //录音软件
{
    boolean canRecord=false;  //能否记录

    void playTape(){
        System.out.println("type playing");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
}
public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t=new TapeDeck();
        t.canRecord=true;
        t.playTape();

        if (t.canRecord==true)
        {
            t.recordTape();
        }
    }
}
