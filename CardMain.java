public class CardMain {
    public static void main(String[] args) {
        Card c = new Card(1, 4);
        Card c1 = new Card(2, 13);
        Card c2 = new Card(3, 5);

        System.out.println(c.suit());
        System.out.println(c.rank());
        System.out.println(c1.suit());
        System.out.println(c1.rank());
        System.out.println(c2.suit());
        System.out.println(c2.rank());

        c.setsuit(2);
        c1.setsuit(1);
    }
}
