public class Main {
    public static void main(String[] args) {
        // Задача 1
        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 2
        for (int fridat = 5; fridat <= 31; fridat += 7) {
            System.out.println("Сегодня пятница, " + fridat + "-e число. Необходимо подготовить отчет. ");
        }

        // Задача 3

        int currentYear = 2022;
        int start = currentYear - 200;
        int ent = currentYear + 100;
        int period = 79;
        int firstAppearedYear = 0;
        for (int year = start; year <= ent; year++){
            if (year % period == firstAppearedYear){
                System.out.println(year);
            }
        }



    }
}