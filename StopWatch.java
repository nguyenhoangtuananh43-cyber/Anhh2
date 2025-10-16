public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.stopTime - this.startTime;
    }

    public static void main(String[] args) {

    }
}
