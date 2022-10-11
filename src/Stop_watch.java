import java.util.Date;

public class Stop_watch {
    private Date startTime,endTime;

    public Stop_watch(){
    }
    public void setStartTime(){
        this.startTime = new Date();
    }
    public Date getStartTime(){
        return this.startTime;
    }
    public void setEndTime(){
        this.endTime = new Date();
    }
    public Date getEndTime(){
        return this.endTime;
    }
   public long getElapsedTime(){
        return getEndTime().getTime()-getStartTime().getTime();
   }
}
