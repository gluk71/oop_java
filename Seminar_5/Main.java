package org.phonebook;

import java.io.IOException;
import java.util.logging.*;

class LogApp {
    /**
     * Старт программы
     * @param args не используется
     */
    public static void main(String[] args)
    {
        // Получаем экземпляр класса, который будем использовать для записи логов.
        // Передаваемый параметр LogApp - имя логера.
        // В документации сказано, что имя логгера должно совпадать с именем
        // класса или пакета ().
        Logger logger = Logger.getLogger(LogApp.class.getName());
        Menu.mainMenu();

        try {
            // Оставляем предыдущий handler (будет создаваться файл "LogApp")
            FileHandler fh = new FileHandler("%tLogApp");
            logger.addHandler(fh);


            // Добавляем ещё файл "LogApp.htm".
            HtmlFormatter htmlformatter = new HtmlFormatter();
            FileHandler htmlfile = new FileHandler("%tLogApp.htm");
            // Устанавливаем html форматирование с помощью класса HtmlFormatter.
            htmlfile.setFormatter(htmlformatter);
            logger.addHandler(htmlfile);


        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }

        logger.log(Level.INFO, "Запись лога с уровнем INFO (информационная)");
        logger.log(Level.WARNING,"Запись лога с уровнем WARNING (Предупреждение)");
        logger.log(Level.SEVERE, "Запись лога с уровнем SEVERE (серъёзная ошибка)",
                new Exception("Проверочное сообщение об ошибке"));
    }
}
