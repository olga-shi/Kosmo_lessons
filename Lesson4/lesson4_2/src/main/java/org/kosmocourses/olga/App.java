package org.kosmocourses.olga;

/**
 * За успешное выполнение учебных заданий в Звездном городке, командование
 * выдало группе 2 дня отпуска. Но на отпуске случилось ЧП, один в космонавтов
 * запасного состава подвернул ногу. Руководство поставило цель срочно найти
 * нового человека на замену.
 *
 * Поэтому вам необходимо написать программу, которая проверит подходит ли
 * кандидат в отряд космонавтов.
 *
 * Программа должна содержать класс Main и
 * Candidate описывающим кандидата.
 *
 * В Main создайте трех кандидатов с разными параметрами и напишите метод в классе Main под названием
 * validation(), который будет проверять переданного ему кандидата и выдавать
 * true если он подходит под требования или false в противном случае.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Main.checkCandidates();
    }
}
