/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammnews.tasks;

/**
 *
 * @author dhergaarden
 */
public class Split {
    
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
    
    private int minSilenceLength;

    /**
     * Get the value of minSilenceLength
     *
     * @return the value of minSilenceLength
     */
    public int getMinSilenceLength() {
        return minSilenceLength;
    }

    /**
     * Set the value of minSilenceLength
     *
     * @param minSilenceLength new value of minSilenceLength
     */
    public void setMinSilenceLength(int minSilenceLength) {
        this.minSilenceLength = minSilenceLength;
    }

        private int silenceBorder;

    /**
     * Get the value of silenceBorder
     *
     * @return the value of silenceBorder
     */
    public int getSilenceBorder() {
        return silenceBorder;
    }

    /**
     * Set the value of silenceBorder
     *
     * @param silenceBorder new value of silenceBorder
     */
    public void setSilenceBorder(int silenceBorder) {
        this.silenceBorder = silenceBorder;
    }

}
