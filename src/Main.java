import CreationDesignPatter.FactoryDesignPattern;
import CreationDesignPatter.SingaletonDesignPatter;
import CreationDesignPatter.FactoryDesignPattern.*;
import CreationDesignPatter.shape;


public class Main {
    public static void main(String[] args) {
        SingaletonDesignPatter singaletonDesignPatter = SingaletonDesignPatter.intializeSingaletonDesignPatter();
        FactoryDesignPattern factoryDesignPattern = new FactoryDesignPattern();
        shape circle = factoryDesignPattern.factory("circle");
        circle.draw();
        shape square = factoryDesignPattern.factory("square");
        square.draw();
    }
}