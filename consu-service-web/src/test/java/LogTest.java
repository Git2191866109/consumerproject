import org.apache.log4j.Logger;

/**
 * Created by wei.ma on 2016/9/12.
 */
public class LogTest {
    static Logger log4j = Logger.getLogger(LogTest.class.getClass());

    public LogTest() {
        System.out.println("hello, I am HMain");

        printLog();
    }

    private void printLog() {

        log4j.debug("log4j debug");
        log4j.info("log4j info");
        log4j.warn("log4j warn");
        log4j.error("log4j error");
        log4j.fatal("log4j fatal");
    }

    public static void main(String[] args) {
        LogTest logTest = new LogTest();
    }
}
