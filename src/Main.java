public class Main {
    public static void main(String[] args) {

        int acc = 100;
        int inc = 1100;

        if (inc > 1000) {
            acc += + inc + inc / 100;
        } else {
            acc += inc;
        }

        System.out.println(acc);

    }
}
