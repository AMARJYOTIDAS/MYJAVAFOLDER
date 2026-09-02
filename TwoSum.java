// trianle pattern

// public class Patterns{
//     public static void main(String[] args) {

//       int n = 5;

// for (int i = 1; i <= n; i++) {

//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     System.out.println();
// }
//     }
// }


// inverted triangle pattern

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;

// for (int i = n; i >= 1; i--) {

//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     System.out.println();
// }
//     }
// }


// Right triangle Pattern
// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;

// for (int i = 1; i <= n; i++) {

//     // spaces
//     for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//     }

//     // stars
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }

//     System.out.println();
// }
//     }
// }

// ===============================================

// Inverted right triangle Pattern

// public class Patterns {

//     public static void main(String[] args){
// int n = 5;

// for (int i = 1; i <= n; i++) {

//     // spaces
//     for (int j = 1; j < i; j++) {
//         System.out.print(" ");
//     }

//     // stars
//     for (int j = i; j <= n; j++) {
//         System.out.print("*");
//     }

//     System.out.println();
// }

//     }
// }

// ===============================================

// Pyramid Pattern

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 3;

// for (int i = 1; i <= n; i++) {

//     // spaces
//     for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//     }

//     // stars
//     for (int j = 1; j <= 2 * i - 1; j++) {
//         System.out.print("*");
//     }

//     System.out.println();
// }
//     }
// }
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + ", " + result[1]);
    }
}

// public class Patterns {
//   public static int[] Twopointer(int[]nums, int target){
//     int left = 0;
//     int right = nums.length-1;

//    while (left < right) {
//     int sum = nums[left] + nums[right];
//       if(sum == target){
//         return new int[] {left, right};
//       }
//       if(left < right){
//         left ++;
//       }
//       else{
//         right --;
//       }

//    }
//    return new int[]{};
//   }
//       public static void main(String[] args) {
//       int[] nums = {1,2,5,8,11,14};
//       int target = 10;
//       int[] result = Twopointer(nums, target);
//       System.out.println(result[0] + "," + result[1]);
//     }
// }