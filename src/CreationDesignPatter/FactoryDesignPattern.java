package CreationDesignPatter;

public class FactoryDesignPattern  {
    public shape factory(String shapeType){
        if(shapeType.equals("circle")){
            return new circle();
        }else if(shapeType.equals("square")){
            return new Square();
        }
        return null;
    }
}
