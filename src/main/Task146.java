package main;

public class Task146 {
    public static void main(String[] args) {
        int[] nums = {310};
        int weight = 0;
        int count = 0;
        while (weight <= 300 && count <= 4) {
            if (count >= nums.length) {
                break;
            }
            weight += nums[count];
            count++;
        }
        if (weight > 300 && count > 4) {
            System.out.println("Людей: " + (count - 1) + ", вес: " + (weight - nums[count - 1])
                    + ", отказ: Много людей и перегруз");
        } else if (weight <= 300 && count <= 4) {
            System.out.println("Людей: " + (count) + ", вес: " + (weight)
                    + ", отказ: Нет");
        } else if (weight > 300 && count <= 4) {
            System.out.println("Людей: " + (count - 1) + ", вес: " + (weight - nums[count - 1])
                    + ", отказ: Перегруз");
        } else {
            System.out.println("Людей: " + (count - 1) + ", вес: " + (weight - nums[count - 1])
                    + ", отказ: Много людей");
        }
    }
}
