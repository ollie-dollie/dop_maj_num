import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ввод количества элементов
        System.out.println("Введите количество элементов массива:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // заполнение массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // поиск мажоритарного элемента
        int result = majorityElement(nums);

        if (result == -1) {
            System.out.println("Мажоритарный элемент не найден");
        } else {
            System.out.println("Мажоритарный элемент: " + result);
        }

        sc.close();
    }

    // метод поиска мажоритарного элемента
    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // находим возможного кандидата
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // проверяем количество повторений кандидата
        int occurrences = 0;

        for (int num : nums) {
            if (num == candidate) {
                occurrences++;
            }
        }

        // мажоритарный элемент должен встречаться больше половины раз
        if (occurrences > nums.length / 2) {
            return candidate;
        }

        return -1;
    }
}
