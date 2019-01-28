/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammnews;

/**
 *
 * @author dhergaarden
 */
public class Task<T> {
       
    private int hour;

    /**
     * Get the value of hour
     *
     * @return the value of hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Set the value of hour
     *
     * @param hour new value of hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

        private int min;

    /**
     * Get the value of min
     *
     * @return the value of min
     */
    public int getMin() {
        return min;
    }

    /**
     * Set the value of min
     *
     * @param min new value of min
     */
    public void setMin(int min) {
        this.min = min;
    }

        private int sec;

    /**
     * Get the value of sec
     *
     * @return the value of sec
     */
    public int getSec() {
        return sec;
    }

    /**
     * Set the value of sec
     *
     * @param sec new value of sec
     */
    public void setSec(int sec) {
        this.sec = sec;
    }

    private boolean repeat;

    /**
     * Get the value of repeat
     *
     * @return the value of repeat
     */
    public boolean isRepeat() {
        return repeat;
    }

    /**
     * Set the value of repeat
     *
     * @param repeat new value of repeat
     */
    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

        private T action;

    /**
     * Get the value of action
     *
     * @return the value of action
     */
    public T getAction() {
        return action;
    }

    /**
     * Set the value of action
     *
     * @param action new value of action
     */
    public void setAction(T action) {
        this.action = action;
    }

}
