public class Main {
    public static void main(String[] args) {
        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinders="8";
        x.size="1234cc";
        x.weight="220kg";


        Color color=new Color();

        color.colorLights="True";
        color.colorTyre="false";
        color.colorWindows="True";

        lights neon=new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intesity="10000lm";

    }
}
