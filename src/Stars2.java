public class Stars2 {
    public static void main(String[] args) {
        line(13);
        line(7);
        line(35);
        box(10,3);
        box(5,4);
    }

    public static void line(int size) {
        lineNoReturn(size);
        System.out.println();
    }

    private static void lineNoReturn(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
    }

    private static void box(int width, int height) {
        lineNoReturn(width);
        System.out.println();
        for (int i = 1; i<=height-2; i++) {
            lineNoReturn(1);
            for (int j = 1; j <= width-2; j++) {
                System.out.print(" ");
            }
            line(1);
        }
        line(width);
    }
}