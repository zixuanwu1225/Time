
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    public void tick(){
        seconds+=1;
        if(seconds>=60){
            seconds=0;
            minutes++;
        }
        if(minutes>=60){
            minutes=0;
            hours++;
        }
        if(hours>=24){
            hours=0;
            minutes=0;
            seconds=0;
        }
    }
    public void add(Time time){
        int timeHours = time.hours;
        int timeMinutes=time.minutes;
        int timeSeconds=time.seconds;
        hours=hours+timeHours;
        minutes=minutes+timeMinutes;
        seconds=seconds+timeSeconds;
        if(seconds>=60){
            int remainingSeconds = seconds-60;
            seconds=0;
            seconds+=remainingSeconds;
        }
        if (minutes >= 60) {
            int remainingMinutes = minutes-60;
            minutes=0;
            minutes+=remainingMinutes;
        }
        if(hours>=24){
            int remainingHours = hours-24;
            hours=0;
            hours+=remainingHours;
        }
    }
    public String toString(){
        String output = "";
        if (hours<10){
            output+="0"+hours+":";
        }
        else output+=hours+":";
        if (minutes < 10) {

            output+="0"+minutes+":";
        }
        else output+=minutes+":";
        if (seconds<10){
            output+="0"+seconds+":";
        }
        else output+=seconds;
        return output;
    }
}
