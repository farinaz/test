package main;

import javax.faces.bean.ManagedBean;

/**
 * Created by nanaz on 7/29/2015.
 */
@ManagedBean(name ="car")
public class Car {
    private String randomId;
    private String randomBrand;
    private String randomColor;
    private int randomYear;
    private int randomPrice;
    private boolean  randomSoldState;

    public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        this.randomId=randomId;
        this.randomBrand=randomBrand;
        this.randomYear=randomYear;
        this.randomPrice=randomPrice;
        this.randomSoldState=randomSoldState;
        this.randomColor=randomColor;
    }

    public String getRandomId() {
        return randomId;
    }

    public void setRandomId(String randomId) {
        this.randomId = randomId;
    }

    public String getRandomBrand() {
        return randomBrand;
    }

    public void setRandomBrand(String randomBrand) {
        this.randomBrand = randomBrand;
    }

    public String getRandomColor() {
        return randomColor;
    }

    public void setRandomColor(String randomColor) {
        this.randomColor = randomColor;
    }

    public int getRandomYear() {
        return randomYear;
    }

    public void setRandomYear(int randomYear) {
        this.randomYear = randomYear;
    }

    public int getRandomPrice() {
        return randomPrice;
    }

    public void setRandomPrice(int randomPrice) {
        this.randomPrice = randomPrice;
    }

    public boolean isRandomSoldState() {
        return randomSoldState;
    }

    public void setRandomSoldState(boolean randomSoldState) {
        this.randomSoldState = randomSoldState;
    }
}
