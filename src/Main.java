
public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        IntOnlyArrayList talOgSager = new IntOnlyArrayList(3);
        System.out.println(talOgSager);
        talOgSager.add(2);
        System.out.println(talOgSager.size());
        System.out.println(talOgSager);
        talOgSager.remove(2);
        System.out.println(talOgSager);
        System.out.println(talOgSager.size());
        System.out.println(talOgSager.get(1));
        talOgSager.addOne(1, 3);
        talOgSager.clearArray();
        System.out.println(talOgSager);

    }
}
