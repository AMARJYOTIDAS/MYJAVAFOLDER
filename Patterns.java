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

public class Patterns {

    public static void main(String[] args) {
        int n = 3;

for (int i = 1; i <= n; i++) {

    // spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    // stars
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }

    System.out.println();
}
    }
}