public class Main {
    public static void main(String[] args) {
        System.out.println("1 Задание");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        System.out.println("2 Задание");
        int clientOS1 = 0;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS1 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("3 Задание");
        int year = 1600;
        {
            if (((year > 1584) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " год является високосным");
            } else if (year > 1584) {
                System.out.println(year + " год не является високосным");

            } else {
                System.out.println("Год должен быть больше 1585");
            }
        }
        System.out.println("4 Задание");
        int deliveryDistance = 120;
            int deliveryDays = 1;
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance > 60) {
                    deliveryDays += 2;
                } else if (deliveryDistance > 20) {
                    deliveryDays += 1;
                }
                System.out.println("Потребуется дней: " + deliveryDays);
            }
        System.out.println("5 Задание");
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
                System.out.println("Такого месяца нет");
        }
    }
}