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
public class Mix {
    private LinkedList<String> inputs = new LinkedList<>();
    private LinkedList<Integer> delays = new LinkedList<>();
    
    public void setDelays(Integer delays) {
        this.delays.add(delays);
    }

    public void setInputs(String inputs) {
        this.inputs.add(inputs);
    }

    public LinkedList<String> getInputs() {
        return inputs;
    }

    public LinkedList<Integer> getDelays() {
        return delays;
    }
    
        private String duration;

    /**
     * Get the value of duration
     *
     * @return the value of duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Set the value of duration
     *
     * @param duration new value of duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
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

}
