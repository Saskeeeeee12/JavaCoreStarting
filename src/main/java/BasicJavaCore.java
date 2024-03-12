import java.util.Arrays;

//1.0. Максимальное, минимальное и среднее значение
//1.1 Сортировка массива
//1.2 Поиск простых чисел
//1.3 Удаление из массива
public class BasicJavaCore {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Основной массив array, случайные элементы от 0 до 99");
        System.out.println(Arrays.toString(array));
        System.out.println("Метод minMaxAveragee, возвращает минимальное, максимальное и среднее значение");
        System.out.println(Arrays.toString(minMaxAveragee(array)));
        System.out.println("Метод bubbleSort, сортировка пузырьком");
        System.out.println(Arrays.toString(bubbleSort(array)));
        System.out.println("Метод поиска простых чисел primeNumber(через запятую диапазон)");
        primeNumber(2, 100);
        System.out.println(" ");
        System.out.println("Метод удаения символа из массива");
        System.out.println(Arrays.toString(deleteNumber(array, 5)));
    }

    //1.0
    public static int[] minMaxAveragee(int[] array) {
        Arrays.sort(array);
        int sum = 0;
        int[] MinMaxAvr = new int[3];
        MinMaxAvr[0] = array[0];
        MinMaxAvr[1] = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        MinMaxAvr[2] = sum / array.length;
        return MinMaxAvr;
    }

    //1.1
    public static int[] bubbleSort(int[] array) {
        int helpunit;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                helpunit = array[i];
                array[i] = array[i + 1];
                array[i + 1] = helpunit;
            }
        }
        return array;
    }

    //1.2
    public static void primeNumber(int startsearch, int endsearch) {
        for (int i = startsearch; i < endsearch; i++) {
            int criterion = 0;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    criterion += 1;
                    break;
                }
            }
            if (criterion == 0) {
                System.out.print(i + " ");
            }
        }
    }
//1.3
    public static int[] deleteNumber(int[] array, int number){
        int counter = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == number) counter++;
        }
        int[] arrayFinish = new int[array.length - counter];
        for (int i = 0; i < array.length; i++){
            if(array[i] != number) {
                arrayFinish[j] = array[i];
                j++;
            }
        }
        return arrayFinish;
    }
}

