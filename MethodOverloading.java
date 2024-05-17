class Computer{
    public void playMusic(){
        System.out.println("Music playing...");
//        return true;
    }
    public String stopMusic(String music){
        System.out.println(music + " stopped!");
        return music;
    }
}

class Calculator2 {
    public int add2(int num1, int num2){
        return  num1 + num2;
    }
    public double add2(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

public class MethodOverloading {
    public static void main(String[] args){
        Computer computer_1 = new Computer();
        computer_1.playMusic(); // Music playing...
        computer_1.stopMusic("Sauti Sol");  //Sauti Sol stopped!

        Calculator2 calc = new Calculator2();
        int add_2_result = calc.add2(3,5); // 8
        double add_3_result = calc.add2(3,5,8); // 16.0
        System.out.println(add_2_result);
        System.out.println(add_3_result);

    }
}
