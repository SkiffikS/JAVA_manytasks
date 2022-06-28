package all;
import java.util.ArrayList;

import task_2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.*;


class Example<T extends Number>
{ // клас який збирає усі інші класи та функції для комплексного додавання арифметичних чисел
    private final Calculator<T> calc;

    public Example(Calculator<T> calc) 
    {
        this.calc = calc; // конструктор
    }

    public T add(T a, T b) 
    {
        return calc.add(a, b); // основна функція додавання
    }
}

interface Calculator<T extends Number> 
{ // класс який виконує арифметичне комплексне додавання
    public T add(T a, T b);
}

class IntCalc implements Calculator<Integer> 
{ // Класс для додавання інтеджерів
    public final static IntCalc INSTANCE = new IntCalc();

    private IntCalc() {} // пустий нонструктор

    public Integer add(Integer a, Integer b) 
    { // функція додавання
        return a + b;
    }
}

class task_2 // Завдання 2
{
    String filename; // Змінна з шляхом до файла

    task_2(String filename)
    {
        this.filename = filename;// конструктор
    }

    void read_text(String filename)
    {
        BufferedInputStream bis = null;
        byte[] buffer = new byte[8192]; // задаємо кількість байтів
        int bytesRead = 0;
        try 
        { // обробляємо можливу помилку
            bis = new BufferedInputStream(new FileInputStream(filename));
            // відкриваємо файл
            while ((bytesRead = bis.read(buffer)) != -1) // по циклі проходимось по рядках
            {
                System.out.write(buffer, 0, bytesRead); // читаємо рядок
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace(); // Виводимо помилку
        } 
        finally
        { // Завершальна частина файлу
            try 
            {
                bis.close(); // якщо усе добре закриваємо файл
            } 
            catch (Exception e) 
            {
                /* meh */
            }
        }
    }

    void input_file(String filename, int number) // запис у файл
    {
        try (final FileWriter writer = new FileWriter(filename, false))
        { // створюємо змінну для запису паралельно відкриваючи файл
            final String s = Integer.toString(number); // переводимо число у рядок
            writer.write(s); // записуємо число
            writer.write(System.lineSeparator()); // переходимо на новий рядок
            System.out.println(s + " - додано до файла"); // виводимо те, що записали
        }
        catch (IOException e) // якщо виникне помилка
        {
            System.out.println(e.getMessage()); // виводимо її
        }
    }
}


public class vet1 
{
    public static void main(String[] args) 
    { // початок виконання коду
        System.out.println("Завдання 1");
        Example<Integer> ex = new Example<Integer>(IntCalc.INSTANCE);
        // Створюємо екземпляр классу Example<Integer> (комплексного додавання)
        ArrayList<Example> arifmetics = new ArrayList<>();
        // Створюємо лист у який помістимо клас
        System.out.println("Комплексне додавання 11i + 10i:");
        System.out.println(ex.add(11, 10));
        arifmetics.add(ex);
        System.out.println("Витягуємо класс iз ArrayList та виконуємо комплексне додавання чисел 0i + 11i");
        System.out.println(arifmetics.get(0).add(0, 11));

        // задача 2:
        System.out.println("Завдання 2");
        // Створюємо екземпляр класу із задачі 2 та передаємо назву файла із яким будмо працювати
        task_2 file_funk = new task_2("task2.txt");
        // Витягаємо функцію із ArrayList та створюємо змінну яку запишемо у файл
        int result = (int) arifmetics.get(0).add(5, 3);
        System.out.println("Записуємо у файл число " + result);
        file_funk.input_file(file_funk.filename, result);
        System.out.println("Читаємо данi iз файла: ");
        file_funk.read_text(file_funk.filename);
    }
}