package Chapter6;

/*
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        //初始化一个SimpleDotCom对象
        SimpleDotCom dot=new SimpleDotCom();

        //创建带有dot com位置的数组
        int[] locations={2,3,4};
        //调用被测方法并传入假的数据
        dot.setLocationCells(locations);

        //假的猜测
        String userGuess="2";
        //调用被测方法并传入假的数据
        String result=dot.checkYourself(userGuess);

//        String testResult="failed";
//        if (result.equals("hit")){
//            testResult="passed";
//            //测试应该要返回"hit"才算成功
//        }
//        //列出测试结果
//        System.out.println(testResult);
    }
}
*/
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numOfGuesses=0; //记录玩家猜测次数的变量
        GameHelper helper=new GameHelper();//我们会写出这个类来取得玩家的输入，现在先假装这是java提供的

        SimpleDotCom theDotCom=new SimpleDotCom();//创建dot com对象
        int randomNum=(int)(Math.random()*5);//用随机数产生第一格的位置，然后以此制作出数组。

        int[] locations={randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationCells(locations);//赋值位置
        boolean isAlive=true;//创建出记录游戏是否继续进行的boolean变量，这会用在while循环中。

        while (isAlive==true){
            String guess=helper.getUserInput("enter a number");  //取得玩家输入的字符串
            //prompt：提示
            String result=theDotCom.checkYourself(guess);//检查玩家的猜测并将结果存储在String中
            numOfGuesses++;  //玩家猜测次数增加
            if (result.equals("kill")){
                isAlive=false;
                System.out.println("You took "+numOfGuesses+" guesses");
            }//close if
        }//close while
    }//close main
}