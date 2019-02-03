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
public class SilenceReplace {
    int silenceBorder;
    int minSilenceLength;
    boolean skipFirst;
    String replacementAudioFile;

    public int getSilenceBorder() {
        return silenceBorder;
    }

    public void setSilenceBorder(int silenceBorder) {
        this.silenceBorder = silenceBorder;
    }

    public int getMinSilenceLength() {
        return minSilenceLength;
    }

    public void setMinSilenceLength(int minSilenceLength) {
        this.minSilenceLength = minSilenceLength;
    }

    public boolean isSkipFirst() {
        return skipFirst;
    }

    public void setSkipFirst(boolean skipFirst) {
        this.skipFirst = skipFirst;
    }

    public String getReplacementAudioFile() {
        return replacementAudioFile;
    }

    public void setReplacementAudioFile(String replacementAudioFile) {
        this.replacementAudioFile = replacementAudioFile;
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
