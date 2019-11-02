import java.util.Date;

public class stopWatch {
    private Date startTime;
    private Date endTime;


    public stopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void end() {
        this.endTime = new Date();
    }

    public long  getElapsedTime() {
        Date endTimes = this.getEndTime();
        Date startTimes = this.getStartTime();
        return endTimes.getTime() - startTimes.getTime();
    }
}
