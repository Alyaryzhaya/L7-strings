public class Main {
    public static void main(String[] args) {


        String name = "Petya";

        // 1. Вывод на печать и склейка
        System.out.println("Привет, " + name);

        // 2. Заменить символ
        System.out.println(name.replace('P', 'q'));
        // однако строка name не изменилась, изменился только ее клон.

        // 3. Сравнение строк
        if(name =="Petya"); // == только для примитивных, для остальных:
        System.out.println("равны");

        if(name.equals("Petya")); // ВЕРНО
        System.out.println("да");

        // 4. NULL - это адрес, значение, которое можно присвоить любой ссылочной переменной
        String surname = null;
        if(surname == null){
            System.out.println("рав");

             // по адресу null нельзя ходить, то есть командами исполнять функции в нем
            //surname.replace('0', '1'); // не работает

        // 5. длина строки
            String nname = "Petya";
            int x = nname.length();
            System.out.println(x);

        // 6. Получать символ по его номеру (нумерация с 0)
            System.out.println(name.charAt(3));

        }





    }
}
