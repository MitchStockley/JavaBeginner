package Book3.chapter3;

public class CountTestApp {

    public static void main(String[] args) {
        printCount();
        for(int i = 0; i < 10; i++){
            CountTest c1 = new CountTest();
            printCount();
        }
    }


    private static void printCount(){
        System.out.println("There are now: " + CountTest.getInstanceCount() + " Instances of the countTest class. ");
    }
}
