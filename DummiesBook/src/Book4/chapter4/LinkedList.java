package Book4.chapter4;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<String> officers = new java.util.LinkedList<>();
        String tuttle = "Tuttle";

        officers.add("Blake");
//        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        officers.add(2, tuttle);
//        String removedItem = officers.set(2, "Murdock");

        System.out.println(officers);
        officers.remove("Blake");
        System.out.println(officers);
        officers.remove(2);
        System.out.println(officers);
        officers.remove( tuttle );
        System.out.println(officers);
        officers.clear();
        System.out.println("Officers " + officers);

        for (String s : officers) {
            System.out.println(s);
        }

    }
}
