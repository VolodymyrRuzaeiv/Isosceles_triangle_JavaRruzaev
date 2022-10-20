/**
 * Isosceles triangle
 * Трикутник рівнобедрений
 * --S--
 * -S-S-
 * S S S
 */

public class IsoscelesTriangle_JavaRuzaiev {
    public static void main(String[] args) {

        int height = 0, space = 0, star = 0;
        System.out.println("Isosceles triangle");
        height = 7;
        space = height;
        star = 1;
        for (int i = 1; i <= height; i++) {

            for (int і = 1; і < space; і++) {
                System.out.print(" " + " ");
            }
            for (int і = 1; і <= star; і++) {
                System.out.print("*" + " ");
            }
            for (int і = 1; і < space; і++) {
                System.out.print(" ");
            }
            space = space - 1;
            star = star + 2;

            System.out.print("\n");
        }
        System.out.print("\n");
    }
}