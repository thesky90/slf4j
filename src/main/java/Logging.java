import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Hansel Chong on 3/1/2016.
 */
public class Logging {

    final static Logger log = LoggerFactory.getLogger(Logging.class);

    public static void testLogging() {
        log.info("this is a test");

        try {
            throw new RuntimeException("test");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        log.trace("Hello World!");
        log.debug("How are you today?");
        log.info("I am fine.");
        log.warn("I love programming.");
        log.error("I am programming.");
    }

    public static void main(String[] args) {
        Logging.testLogging();
    }
}
