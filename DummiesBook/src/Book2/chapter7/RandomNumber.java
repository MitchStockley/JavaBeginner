package Book2.chapter7;

public class RandomNumber {

    public static void main(String[] args) {
        int number = getRandomNum(1,15);
        System.out.println("Number is: " + number);
    }

    public static int getRandomNum(int min, int max){
        int num = (int)(Math.random() * (max - min + 1)) + min;
        return num;
    }
}