/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammnews.tasks;

import java.util.LinkedList;

/**
 *
 * @author dhergaarden
 */
public class Order<T> {
       
    private int hour;
    private LinkedList<T> actions = new LinkedList<>();


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


    /**
     * Get the value of action
     *
     * @return the value of action
     */
    public LinkedList getActions() {
        return actions;
    }

    /**
     * Set the value of action
     *
     * @param action new value of action
     */
    public void setAction(T action) {
        this.actions.add(action);
    }

        private int days;

    /**
     * Get the value of days
     *
     * @return the value of days
     */
    public int getDays() {
        return days;
    }

    /**
     * Set the value of days
     *
     * @param days new value of days
     */
    public void setDays(int days) {
        this.days = days;
    }

        private String output;

    /**
     * Get the value of output
     *
     * @return the value of output
     */
    public String getOutput() {
        return output;
    }

    /**
     * Set the value of output
     *
     * @param output new value of output
     */
    public void setOutput(String output) {
        this.output = output;
    }

        private String input;

    /**
     * Get the value of input
     *
     * @return the value of input
     */
    public String getInput() {
        return input;
    }

    /**
     * Set the value of input
     *
     * @param input new value of input
     */
    public void setInput(String input) {
        this.input = input;
    }

}
