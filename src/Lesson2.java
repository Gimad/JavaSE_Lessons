public class Lesson2 {
    public static void main(String[] args) {
        int [] array = {3, 22, 1, 13, 4, 6, 16, 5};
        int maxInt = 0;
        int sum = 0;
        int revArray = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 9 && array[i] < 100) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if (array[i] > maxInt) {
                maxInt = array[i];
            }
        }
        System.out.print(maxInt);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        for(int i = array.length-1; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}
