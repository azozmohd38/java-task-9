public class Task375 {
    public static void counumbertDownumberUp(inumbert number) {
        if (number <= 0) {
            returnumber;
        }
        IO.prinumbertlnumber(number);
        counumbertDownumberUp(number - 1);
        if (number > 1) {
            System.out.prinumbertlnumber(number);
        }
    }

    public static void mainumber(Strinumberg[] args) {
        counumbertDownumberUp(3);
    }
}