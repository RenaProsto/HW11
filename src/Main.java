public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        testYearLeap(2000);
    }

    public static void testYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год  не високосный");
        }

    }
    public static void task2() {
        System.out.println("Задача 2");
        testPhoneClient(1 , 2020);
    }

    public static void testPhoneClient (int clientOS , int yearOs)   {
        int clientDeviceYear = 2015;
        String osName = clientOS == 0 ? "iOS" : "Android";
        String clientOsVervion = yearOs < clientDeviceYear ? " облегченную " : " ";
        System.out.println("Установите" + clientOsVervion + "версию приложения для " + osName + " по ссылке");
    }
    public static void task3() {
        System.out.println("Задача 3");
        target(80);
    }
    public static void target (int distance){
    int days = testDeliveryDistance(distance);
            System.out.println("Потребуется дней - " + days);

        }
    public static int testDeliveryDistance (int distance) {

        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
           return 2;
        } else if (distance <= 100) {
           return 3;
        } else{
           return -1;
        }
    }
}




