//2.0. Проектирование и создание класса, описывающего вектор
public class BasicOOP {
    class Vector {
        public int x;
        public int y;
        public int z;

        Vector(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static double vectorLenght(int x, int y, int z) {
        return (int) Math.sqrt(x * x + y * y + z * z);
    }

    public static double vectorScalarProduct(int x1, int y1, int z1, int x2, int y2, int z2) {
        return x1 * x2 + y1 * y2 + z1 * z2;
    }

    public static int[] vectorsProduct(int x1, int y1, int z1, int x2, int y2, int z2) {
        int[] array = new int[3];
        array[0] = y1 * z2 - z1 * y2;
        array[1] = z1 * x2 - x2 * z2;
        array[2] = x1 * y2 - y1 * x2;
        return(array);
    }


}
