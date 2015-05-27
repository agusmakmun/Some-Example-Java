/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */

public class Bicycle {
    int cadance;
    int speed;
    int gear;
    
    void changeCadance (int newValue) {
        cadance = newValue;
    }
    void changeGear (int newValue) {
        gear = newValue;
    }
    void speedUp (int increment) {
        speed = speed+increment;
    }
    void applyBreak (int decrement) {
        speed = speed - decrement;
    }
    void printStates(){
        System.out.println("Speed = "+ speed + ", "+
                "Gear = "+gear+", "+"Cadancce = "+cadance);
    }
}
