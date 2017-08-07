package Chapter2;

class Movie{
    String title;
    String genre;//类型
    int rating;//评分

    void playIt()
    {
        System.out.println("Playing the movie");
    }
}
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one=new Movie();
        one.title="Gone with the Stock";//随着股票走了
        one.genre="Tragic";//悲惨
        one.rating=-2;
        Movie two=new Movie();
        two.title="Lost in Cubicle Space";//失去了在空间
        two.genre="Comedy";//喜剧
        two.rating=5;
        Movie three=new Movie();
        three.title="Byte Club";//字节俱乐部
        three.genre="Tragic but ultimately uplifting";//悲剧但最终令人振奋
        three.rating=127;
    }
}
