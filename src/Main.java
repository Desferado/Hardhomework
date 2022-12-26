import java.util.concurrent.ThreadLocalRandom;
import java.time.Clock;
public class Main {
      public static void main(String[] args) {
          task1();
          task2();
          task3();
          task4();
          task5();
          task6();
          task7();
          task8();
          task9();
          task10();
      }
        public static void task1() {
           System.out.println("It's task #1");
           int arr = ThreadLocalRandom.current().nextInt(3, 159);
           if (arr > 22 && arr < 99) {
               System.out.println("Случайное число " + arr + " попало в заданный (22,99) диапазон");
           } else {
               System.out.println("Случайное число " + arr + " не попало в заданный (22,99) диапазон");
           }
            System.out.println();
        }
        public static void task2() {
            System.out.println("It's task #2");
            int arr = ThreadLocalRandom.current().nextInt(100,1000);
            int n1 = arr / 100;
            int n2 = arr / 10 % 10;
            int n3 = arr % 10;
            int [] arr1 = {n1,n2,n3};
            int max = n1;
            if (n1 < n2 && n2 > n3) {
                max = n2;
                System.out.println("Наибольшей цифрой в числе " + arr + " является цифра " + max);
            } else if (n1 < n3) {
                max = n3;
                System.out.println("Наибольшей цифрой в числе " + arr + " является цифра " + max);
            } else {
                System.out.println("Наибольшей цифрой в числе " + arr + " является цифра " + max);
            }
            System.out.println();
        }
        public static void task3() {
            System.out.println("It's task #3");
            int a = ThreadLocalRandom.current().nextInt(-1000,1000);
            int b = ThreadLocalRandom.current().nextInt(-1000,1000);
            int c = ThreadLocalRandom.current().nextInt(-1000,1000);
            if (a != b && a != c && b != c) {
                if (a < b && a < c && b < c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else if (a < b && a < c && b > c) {
                    System.out.println(a + ", " + c + ", " + b);
                } else if (b < a && b < c && a < c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else if (b < a && b < c && a > c) {
                    System.out.println(b + ", " + c + ", " + a);
                } else if (c < a && c < b && b > a) {
                    System.out.println(c + ", " + a + ", " + b);
                } else if (c < a && c < b && b < a) {
                    System.out.println(c + ", " + b + ", " + a);
                }
            }
            System.out.println();
        }
        public static void task4 () {
            System.out.println("It's task #4");
            int currentTime = ThreadLocalRandom.current().nextInt(28800);
            int workday = 28800;
            int a = workday - currentTime;
            int timeRemainedHours = a / 3600;
            int timeRemainedMinutes = (a - (timeRemainedHours * 3600)) / 60;
            int timeRemainedSeconds = (a - (timeRemainedHours * 3600)) - (timeRemainedMinutes * 60);
            System.out.println(a);
            System.out.println("До конца рабочего дня осталось " + timeRemainedHours +
                        " часов " + timeRemainedMinutes + " минут " + timeRemainedSeconds + " секунд!");
            System.out.println();
        }
        public static void task5() {
            System.out.println("It's task #5");
            int number = 1000;
            int divider = 4;
            int quantity = 5;
            while (quantity > 0) {
                if (number % divider == 0) {
                    System.out.print(number + " ");
                    quantity--;
                }
                number++;
            }
            System.out.println();
        }
        public static void task6() {
            System.out.println("It's task #6");
            int number = 1;
            int quantity = 10;
            while (quantity > 0) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                    quantity--;
                }
                number++;
            }
            System.out.println();
        }
        public static void task7() {
            System.out.println("It's task #7");
            int number = 90;
            while (number >= 0) {
                if (number % 5 == 0) {
                    System.out.print(number + " ");
                }
                number --;
            }
            System.out.println();
        }
        public static void task8() {
            System.out.println("It's task #8");
            int number = 2;
            int quantity = 10;
            while (quantity > 0) {
                System.out.print(number + " ");
                number = number * 2;
                quantity--;
            }
            System.out.println();
        }
        public static void task9() {
            System.out.println("It's task #9");
            int saturday = 1;
            while (saturday <= 31) {
                System.out.print(saturday + ", " + (saturday +1) + "; ");
                saturday += 7;
            }
            System.out.println();
        }
        public static void task10() {
            System.out.println("It's task #10");
            int counter = 0;
            for (int i = 1000; i < 1000000; i++) {
                int firstNumber = i/1000;
                int secondNumber = i%1000;
                int firstNumber1 = firstNumber/100 + firstNumber/10%10 + firstNumber%10;
                int secondNumber1 = secondNumber/100 + secondNumber/10%10 + secondNumber%10;
                if (firstNumber1 == secondNumber1) {
                    counter ++;
                }
            }
            System.out.println("Quantity lucky tickets in array [1,999999] - " + counter);
            System.out.println();
        }

}

