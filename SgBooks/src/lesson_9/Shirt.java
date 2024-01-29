/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_9;

/**
 *
 * @author Mitch
 */
public class Shirt {

    private int shirtId = 0;
    private String desc = "description required";
    private char colorCode = 'U';
    private double price = 0.0;

    public Shirt() {

    }

    public Shirt(char colorCode) {
        setColorCode(colorCode);

    }

    public Shirt(char colorCode, double price) {
        this(colorCode);
        setPrice(price);
    }

    public Shirt(char colorCode, String desc, double price) {
        this(colorCode, price);
        setDesc(desc);

//        setPrice(price);
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        if (colorCode == 'R') {
            this.colorCode = colorCode;
            return;
        }

        if (colorCode == 'G') {
            this.colorCode = colorCode;
            return;
        }

        if (colorCode == 'B') {
            this.colorCode = colorCode;
            return;
        }
        System.out.println(colorCode + " is an invalid code");
    }

    /**
     * @return the shirtId
     */
    public int getShirtId() {
        return shirtId;
    }

    /**
     * @param shirtId the shirtId to set
     */
    public void setShirtId(int shirtId) {
        this.shirtId = shirtId;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
