public class Main {
    public static void main(String[] args) {
        Mova mova = new Mova(1,2,3,4);
        System.out.println(mova.toString());
        mova.move();
        System.out.println(mova.toString());
    }
}
