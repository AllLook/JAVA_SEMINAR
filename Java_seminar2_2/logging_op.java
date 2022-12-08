package Java_seminar2_2;

import java.io.IOException;
import java.util.logging.*;
import java.io.FileWriter;;

public class logging_op {
    public static void main(String[] args) throws SecurityException, IOException {
        log_ging();
    }

    public static void log_ging() throws SecurityException, IOException {
        String mess = "";
        mess = Main.op_name(mess);
        Logger logger = Logger.getLogger(logging_op.class.getName()); // имя класса для которого работает логирование и
                                                                      // переменная для этого
        FileWriter fw = new FileWriter("log.txt", true);
        FileHandler fn = new FileHandler("log.txt", true);// Handler для работы с файломи переменная и путь к файлу
        logger.addHandler(fn); // Handler как аргумент для логера
        SimpleFormatter simple = new SimpleFormatter();//
        fn.setFormatter(simple);// описание формата сообщения
        logger.log(Level.INFO, "operation completed");
        fw.append(mess);
        fw.append("  end operation");
        fw.append("\n");
        fw.append("-----------------------------------\n");
        fn.close();
        fw.close();
    }
}
