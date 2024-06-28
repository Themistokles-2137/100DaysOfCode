import java.util.Random;
class Ran{
    public static void main(String[] args) {
        Random ran = new Random();
        int c = ran.nextInt(100);
        System.out.println(c);
    }
}