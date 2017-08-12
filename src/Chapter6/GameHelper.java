package Chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine=null;
        System.out.print(prompt+" ");  //promit 提示
        try{
            BufferedReader is =new BufferedReader(new InputStreamReader(System.in));
            //BufferedReader 缓冲字符输入流
            //InputStreamReader将字节流转换为字符流

            inputLine=is.readLine();
            if (inputLine.length()==0)
                return null;
        }catch (IOException e){
            System.out.println("IOException:"+e);
        }
        return inputLine;
    }
}
