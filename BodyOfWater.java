public class BodyOfWater{
    private String name;
    private int avgDepth;
    private int largeDiameter;
    private boolean saltWater;

    public BodyOfWater(String n, int avgdepth, int largediameter, boolean salt){
        name = n;
        avgDepth = avgdepth;
        largeDiameter = largediameter;
        saltWater = salt;
    }

    public BodyOfWater(String n, int avgdepth){
        name = n;
        avgDepth = avgdepth;
    }

    public String name(){
        return name;
    }
    public int avgDepth(){
        return avgDepth;
    }
    public int largeDiameter(){
        return largeDiameter;
    }
    public boolean saltWater(){
        return saltWater;
    }

    public void setlargeDiameter(int largediameter){
        largeDiameter = largediameter;
    }
    public void setName(String n){
        name = n;
    }







}
