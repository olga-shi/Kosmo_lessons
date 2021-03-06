package org.kosmocourses.olga;

/**
 * Ваша группа космонавтов по заданию ЦК была направлена в NASA для осуществления дружеского визита и обмена опытом.
 * Вам необходимо иметь доллары на расходы за границей и поэтому вам разрешено приобрести валюту
 * за рубли. Вот только непонятно, сколько вам нужно выдать долларов и сколько взять с вас рублей.
 * Вам, как инженеру-космонавту, надо создать программу перевода рублей в доллары. Для этого напишите метод с
 * сигнатурой: public double toUSD(int rub, double course)
 * Метод должен переводить рубли в доллары по курсу заданному ГосБанком СССР в 1990 г.
 * (http://www.vsedela.ru/index.php?topic=3058.0).
 * Вызовите этот метод в методе main() c любыми параметрами, результат напечатайте в консоль.
 *
 * 	Цена рубля 1,6469 $
 */
public class App 
{
    public static void main( String[] args )
    {
        int rub = 100; // указываем тут сумму в рублях, которую хотим поменять
        double course = 1.6469; // указываем цену рубля
        App converter = new App(); // создаем экземпляр класса App
        /** вызываем метод print у экземпляра класса App (для красивой печати)
         *  В параметрах метода указываются переменные  rub, course
         *  В качестве третьего аргумента, вызывается метод toUSD
        */
        converter.print(rub, course, converter.toUSD(rub, course));
        rub = 50; // еще раз - для себя
        converter.print(rub, course, converter.toUSD(rub, course));
    }

    public double toUSD(int rub, double course) // метод для конвертации
    {
        double usd = rub * course; // формула конвертации
        return usd; // возвращаем результат
    }

    public void print(int rub, double course, double usd) // метод для красивой печати
    {
        System.out.println("За " + rub + " Руб, по курсу " + course + " вы получите " + usd + " $");
    }
}
