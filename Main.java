public class Main {

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int x : nums) {
            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (x == candidate) {
                count++;
            } else {
                count--;
            }
        }

        int occurrences = 0;
        for (int x : nums) {
            if (x == candidate) occurrences++;
        }

        return (occurrences > nums.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4, 2, 1, 2, 2};

        int result = majorityElement(nums);

        if (result != -1) {
            System.out.println("Мажоритарный элемент: " + result);
        } else {
            System.out.println("Мажоритарного элемента нет");
        }
    }
}