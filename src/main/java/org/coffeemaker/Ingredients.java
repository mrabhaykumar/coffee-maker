package org.coffeemaker;

import java.util.HashMap;

public class Ingredients {
    volatile int hotWater = 0;
    volatile int hotMilk = 0;
    volatile int gingerSyrup = 0;
    volatile int sugarSyrup = 0;
    volatile int teaLeavesSyrup = 0;
    volatile int coffeeSyrup =0 ;

    public int getGreenMixture() {
        return greenMixture;
    }

    public void setGreenMixture(int greenMixture) {
        this.greenMixture = greenMixture;
    }

    volatile int greenMixture = 0;


    public int getHotWater() {
        return hotWater;
    }

    public void setHotWater(int hotWater) {
        this.hotWater = hotWater;
    }

    public int getHotMilk() {
        return hotMilk;
    }

    public void setHotMilk(int hotMilk) {
        this.hotMilk = hotMilk;
    }

    public int getGingerSyrup() {
        return gingerSyrup;
    }

    public void setGingerSyrup(int gingerSyrup) {
        this.gingerSyrup = gingerSyrup;
    }

    public int getSugarSyrup() {
        return sugarSyrup;
    }

    public void setSugarSyrup(int sugarSyrup) {
        this.sugarSyrup = sugarSyrup;
    }

    public int getTeaLeavesSyrup() {
        return teaLeavesSyrup;
    }

    public void setTeaLeavesSyrup(int teaLeavesSyrup) {
        this.teaLeavesSyrup = teaLeavesSyrup;
    }

    public int getCoffeeSyrup() {
        return coffeeSyrup;
    }

    public void setCoffeeSyrup(int coffeeSyrup) {
        this.coffeeSyrup = coffeeSyrup;
    }


}