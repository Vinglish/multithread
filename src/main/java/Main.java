public class Main {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        ParticipantThread participantThread = new ParticipantThread(incrementer);
        Thread runnableRacer = new Thread(new ParticipantRunnable(incrementer));
        runnableRacer.start();
        participantThread.start();
    }
}
