import org.apache.log4j.Logger;

public class ParticipantThread extends Thread {

    private final Incrementer incrementer;
    private final Logger logger = Logger.getLogger(ParticipantThread.class);

    public ParticipantThread(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (!incrementer.isTop()) {
            incrementer.increment();
            logger.info("Thread: " + incrementer.getPosition());
        }
        logger.info("Thread has finished!");
    }
}