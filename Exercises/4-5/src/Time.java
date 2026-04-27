public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>=24) this.hour = 23;
        else if (hour<0) this.hour = 0;
        else this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute>=60) this.minute = 59;
        else if (minute<0) this.minute = 0;
        else this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second>=60) this.second = 59;
        else if (second<0) this.second = 0;
        else this.second = second;
    }
    public void setTime(int hour,int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return hour+":"+minute+":"+second;
    }

    public Time nextSecond(){
        this.second++;
        if (second>=60){
            this.second = 0;
            this.minute++;
            if (minute>=60){
                this.minute = 0;
                this.hour++;
                if (hour>=24){
                    this.hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        this.second--;
        if (second<0){
            this.second = 59;
            this.minute--;
            if (minute<0){
                this.minute = 59;
                this.hour--;
                if (hour<0){
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}
