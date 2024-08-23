public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Ocean", 30, 3400, true);
        BodyOfWater b1 = new BodyOfWater("Lake", 1000);

        System.out.println(b.name());
        System.out.println(b.avgDepth());
        System.out.println(b.largeDiameter());
        System.out.println(b.saltWater());

        System.out.println(b1.name());
        System.out.println(b1.avgDepth());

        b.setName("Indian Oshan");
        b1.setName("big ass Lake");

        System.out.println(b.name());
        System.out.println(b1.name());
    }
}
