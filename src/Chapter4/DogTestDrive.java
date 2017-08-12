package Chapter4;


class Dog{
    int size;
    String name;

    void bark(){
        if (size>60){
            System.out.println("Woof!  Woof!");
        } else if (size>14){
            System.out.println("Ruff!  Ruff!");
        }else {
            System.out.println("Yip!  Yip");
        }
    }
    void bark(int numOfBarks){   //形参numOfBarks
        while (numOfBarks>0)
        {
            System.out.println("ruff");
            numOfBarks=numOfBarks-1;
        }
    }
}
public class DogTestDrive {
    public static void main(String[] args) {
        Dog one=new Dog();
        one.size=70;
        Dog two=new Dog();
        two.size=8;
        Dog three=new Dog();
        three.size=35;

        one.bark();
        two.bark();
        three.bark();

        //以int类型表示的值3会传递给bark().
        Dog d=new Dog();
        d.bark(3);//实参3
    }
}
