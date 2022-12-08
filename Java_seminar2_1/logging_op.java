package Java_seminar2_1;

import java.io.IOException;
import java.util.logging.*;;

public class logging_op {
    public static void main(String[] args) throws SecurityException, IOException {
        log_ging();
    }

    public static void log_ging() throws SecurityException, IOException {
        Logger logger = Logger.getLogger(logging_op.class.getName()); // имя класса для которого работает логирование и
                                                                      // переменная для этого
        FileHandler fn = new FileHandler("log.txt", true);// Handler для работы с файломи переменная и путь к файлу
        logger.addHandler(fn); // Handler как аргумент для логера
        SimpleFormatter simple = new SimpleFormatter();//
        fn.setFormatter(simple);// описание формата сообщения
        logger.log(Level.INFO, "Sorting current element");
        fn.close();
    }

}