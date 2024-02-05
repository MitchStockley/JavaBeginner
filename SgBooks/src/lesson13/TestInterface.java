/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

/**
 *
 * @author Mitch
 */
public class TestInterface {

    public static void main(String[] args) {
//        public static void main(String[] args) {
//        Shirt myShirt = new Shirt(1,"Shirt",200.99,'R','M');
//        myShirt.print();
//        myShirt.doReturn();
        Clothing c1 = new Trousers(1, "Trousers", 200.99, 'R', 'M');
        Trousers t1 = new Trousers(1, "Trousers", 200.99, 'R', 'M');
        Returnable r1 = new Trousers(1, "Trousers", 200.99, 'R', 'M');

        c1.getColorCode(); // acces it's own method
        if (c1 instanceof Trousers) {
            ((Trousers) c1).getFit();// it can't access method from Trousers unless it is cast to a Trousers
        }

        if (c1 instanceof Returnable) {
            ((Returnable) c1).doReturn(); // it can't access method from interface unless it is cast to a Trousers or interface
        }
        t1.getFit(); // accessing its own method
        t1.getItemId(); //accessing the method from Clothing class
        t1.doReturn(); //accessing method from interface

        r1.doReturn(); // access it own method

        if (r1 instanceof Clothing) {
            ((Clothing) r1).getColorCode(); //it can't access method from Clothing unless it is cast to a Trousers or Clothing
        }

        if (r1 instanceof Trousers) {
            ((Trousers) r1).getFit(); // it can't access method from Trousers unless it is cast to a Trousers
        }


    }
}
