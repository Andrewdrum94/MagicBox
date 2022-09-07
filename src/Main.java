public class Main {

    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        magicBox.add(100);
        System.out.println(magicBox.add(214));
        magicBox.add(321);
        magicBox.add(12312);
        System.out.println(magicBox.pick());

        MagicBox<String> magicBox1 = new MagicBox<>(5);
        magicBox1.add("River");
        magicBox1.add("Tree");
        System.out.println(magicBox1.pick());
    }
}
