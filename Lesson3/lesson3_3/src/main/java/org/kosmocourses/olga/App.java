package org.kosmocourses.olga;

/**
 * Вся группа советских космонавтов решила скинуться по 7% от
 * командировочных (командировочные разные у каждого члена группы и зависят
 * от роли и звания человека, конкретные цифры придумайте сами).
 * В группе
 * прибывших советских космонавтов всего 6 человек, из них 3 человека основной
 * экипаж: командир, второй пилот, инженер (это вы) и 3 в дублирующем составе.
 * Как истинный инженер, вы решили быстро написать программу подсчета
 * оставшегося бюджета каждого космонавта.
 *
 * Для этого напишите метод под названием ​ calculate()​ , принимающий
 * количество командировочных денег у каждого космонавта в виде массива и
 * уменьшающий элементы массива на 7%.
 *
 * Вызовите его из ​ main() и
 * распечатайте значение до и после изъятия 7%.
 *
 * Подумайте, должен ли метод изменять исходный массив, или в результате
 * работы будет создаваться новый. Обоснуйте свое решение преподавателю,
 * написав это в комментарии к методу.
 */
public class App
{
    public static void main( String[] args )
    {
        double[] salaries = {3000, 3000, 2000, 2000, 1000, 1000}; //объявляем массив с зарплатами
        double[] sale = calculate(salaries); //создание нового массива, в который передали вычисленные значения зп
        System.out.println("Зарплата До: ");
        //печатаем каждый элемент оригинального массива
        for (int i = 0; i < salaries.length; i++){
            System.out.println( salaries[i]);
        }
        //печатаем каждый элемент вычисленного массива
        System.out.println("Зарплата После: ");
        for (int i = 0; i < sale.length; i++){
            System.out.println( sale[i]);
        }

    }

    public static double[] calculate(double[] salaries)
    {
        double percent = 0.07; // размер процента
        
        /** создаем новый пустой массив (который содержит ссылку на новую область памяти)
         * для того, чтобы избежать копирования ссылки на оригинальный массив
         */

        double[] newsalaries = new double[6];
        // в каждый элемент нового массива записываем расчитанное значение
        for (int i = 0; i < salaries.length; i++){
            newsalaries[i] = salaries[i] - salaries[i] * percent;
        }
        return newsalaries; // возвращаем новый массив
    }
}