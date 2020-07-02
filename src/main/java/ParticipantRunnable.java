import org.apache.log4j.Logger;

public class ParticipantRunnable implements Runnable {

    private final Incrementer incrementer;
    private final Logger logger = Logger.getLogger(ParticipantRunnable.class);

    public ParticipantRunnable(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (!incrementer.isTop()) {
            incrementer.increment();
            logger.info("Runnable: " + incrementer.getPosition());
        }
        logger.info("Runnable has finished!");
    }
}