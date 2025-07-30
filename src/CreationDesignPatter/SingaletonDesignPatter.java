package CreationDesignPatter;

public class SingaletonDesignPatter {
    private static SingaletonDesignPatter singaletonDesignPatter;
    private SingaletonDesignPatter(){
    }
    public static SingaletonDesignPatter intializeSingaletonDesignPatter() {
        if(singaletonDesignPatter == null) {
            singaletonDesignPatter = new SingaletonDesignPatter();
        }
        return singaletonDesignPatter;
    }
}
