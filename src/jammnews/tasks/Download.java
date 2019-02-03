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
public class Download {

    private String url;

    /**
     * Get the value of url
     *
     * @return the value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the value of url
     *
     * @param url new value of url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    private String pass;

    /**
     * Get the value of pass
     *
     * @return the value of pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Set the value of pass
     *
     * @param pass new value of pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

        private String user;

    /**
     * Get the value of user
     *
     * @return the value of user
     */
    public String getUser() {
        return user;
    }

    /**
     * Set the value of user
     *
     * @param user new value of user
     */
    public void setUser(String user) {
        this.user = user;
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

        private boolean auth;

    /**
     * Get the value of auth
     *
     * @return the value of auth
     */
    public boolean isAuth() {
        return auth;
    }

    /**
     * Set the value of auth
     *
     * @param auth new value of auth
     */
    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    
    @Override
    public String toString() {
        return "Download{" + "url=" + url + ", pass=" + pass + ", user=" + user + ", output=" + output + '}';
    }

    
}
