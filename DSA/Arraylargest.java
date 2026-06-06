public class Arraylargest {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 9, 21, 7};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element in the array: " + largest);
    }
}
