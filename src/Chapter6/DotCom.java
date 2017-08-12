package Chapter6;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;   //将带有String的数组改成承载String的ArrayList
//    int numOfHits=0;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells=locs;
    }
    public String checkYourself(String userInput){  //参数有了新名称
        String result="miss";
        int index=locationCells.indexOf(userInput);
        if (index>=0){   //如果索引值大于或等于0，命中！
            locationCells.remove(index);

            if (locationCells.isEmpty()){  //
                result="kill";
            }
        }
        System.out.println(result);
        return result;
    }//close method
}//close class