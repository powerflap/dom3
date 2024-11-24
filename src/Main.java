import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1 " );

        int clientOS = 1 ;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке" );

        }
        else  {
            System.out.println("Установите версию приложения для Android по ссылке" );
        }

        System.out.println("Задача 2 " );

        int clientDeviceYear = 2013;

        int clientOs1 = 0;
        int clientDeviceyear = 2015;
        if (clientOs1 != 1 && clientDeviceyear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs1 != 1 && clientDeviceyear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs1 == 1 && clientDeviceyear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs1 == 1 && clientDeviceyear < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Задача 3 " );

        int year = 1994;

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.printf("%d год является високосным%n", year);
            } else {
                System.out.printf("%d год не является високосным%n", year);
            }
        } else {
            System.out.println("Год должен быть больше, чем 1584.");
        }


        System.out.println("Задача 4 " );

        int deliveryDistance = 100 ;

        if (deliveryDistance<= 20) {
            System.out.println("Потребуется дней: 1 ");
            if (deliveryDistance>=20 && deliveryDistance<60){
                System.out.println("Потребуется дней: 3 ");
            }
        }
        if (deliveryDistance>= 60 && deliveryDistance< 100) {
            System.out.println("Потребуется дней: 4 ");
        }

        if (deliveryDistance>= 100){
                System.out.println("свыше 100 км доставки нет");
            }

        System.out.println("Задача 5 " );

        int monthNumber = 12 ;

        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого времени года не существует");
        }


    }














    }



