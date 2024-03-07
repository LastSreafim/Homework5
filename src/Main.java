public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 2;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Новой версии приложения для СЯУСУНЬПАУХУАНЬ еще не вышло");
        }

        //task2
        int oS = 1;
        int year = 2016;
        if (oS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (oS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Убедительная просьба! Избавьтесь от несертефицированного китайского девайса");
        }

        //task3
        int yearT = 2016; //сделал специально вложенный оператор для усвоения материала
        if (yearT >= 1584) {
            if (yearT % 4 == 0 && yearT % 100 != 0 || yearT % 400 == 0) {
                System.out.println(yearT + " год является високосным");
            } else {
                System.out.println(yearT + " год не является високосным");
            }
        } else {
            System.out.println("Понятия високосного года еще не ввели");
        }

        //task4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (60 < deliveryDistance && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3.");
        } else {
            System.out.println("Доставки нет");
        }

        //task5
        int monthNumber = 2;  //Ну я сначала тут прописал на каждый кейс СОУТ, но для закрепления переписал, как Захар показал на уроке
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
        }

    }
}