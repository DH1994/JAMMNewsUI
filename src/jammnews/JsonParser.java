/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammnews;

import jammnews.tasks.Order;
import jammnews.tasks.Mix;
import jammnews.tasks.ShellCmd;
import jammnews.tasks.Download;
import jammnews.tasks.Concat;
import jammnews.tasks.Split;
import java.awt.List;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.parser.JSONParser;

import org.json.*;


/**
 *
 * @author dhergaarden
 */


public class JsonParser {

    JSONObject json = new JSONObject();
    LinkedList<Order> taskList = new LinkedList<>();
    
    
    public JsonParser(LinkedList<Order> taskList) 
    {
        this.taskList = taskList;
        //jsonParse();
    }
    
    public JsonParser(String json)
    {
        try {
            this.json = new JSONObject(json);
            jsonRead();
        } catch (JSONException ex) {
            Logger.getLogger(JsonParser.class.getName()).log(Level.SEVERE, null, ex);
        }               
    }
    
    private void jsonRead()
    {
        try {
            JSONArray arr = json.getJSONArray("tasks");
            taskList.clear();
            for(int i = 0; i < arr.length(); i++)
            {
                JSONObject jo = (JSONObject)arr.get(i);
                Order t = new Order();
                
                t.setHour(jo.getInt("hour"));
                t.setMin(jo.getInt("min"));
                t.setSec(jo.getInt("sec"));
                t.setRepeat(jo.getBoolean("repeat"));
               
                if(jo.getString("action").contentEquals("download"))
                {                    
                    Download d = new Download();
                    d.setOutput(jo.getString("output"));
                    d.setPass(jo.getString("pass"));
                    d.setUrl(jo.getString("url"));
                    d.setUser(jo.getString("user"));
                    t.setAction(d);      
                    
                }
                
                if(jo.getString("action").contentEquals("cct"))
                {
                    Concat c = new Concat();
                    c.setInput1(jo.getString("input1"));
                    c.setInput2(jo.getString("input2"));
                    c.setOutput(jo.getString("output"));
                    t.setAction(c);
                }
                
                if(jo.getString("action").contentEquals("mix"))
                {
                    Mix m = new Mix();
                    m.setDuration(jo.getString("duration"));
                    m.setOutput(jo.getString("output"));
                    
                    JSONArray iArr = jo.getJSONArray("input");
                    JSONArray dArr = jo.getJSONArray("delay");
                    
                    int j;
                    for(j= 0; j < iArr.length(); j++)
                    {
                        m.setInputs(iArr.getString(j));
                    }
                    
                    for(j= 0; j < dArr.length(); j++)
                    {
                        m.setDelays(dArr.getInt(j));
                    }
                    t.setAction(m);
                }
                
                if(jo.getString("action").contentEquals("cmd"))
                {
                    ShellCmd sc = new ShellCmd();
                    sc.setCmd(jo.getString("cmd"));
                    t.setAction(sc);
                }
                
                if(jo.getString("action").contentEquals("split"))
                {
                    Split sp = new Split();
                    sp.setInput(jo.getString("input"));
                    sp.setOutput(jo.getString("output"));
                    sp.setMinSilenceLength(jo.getInt("minSilenceLength"));
                    sp.setSilenceBorder(jo.getInt("silenceBorder"));
                    t.setAction(sp);
                }
                
                taskList.add(t);
            }
                
        } catch (JSONException ex) {
            Logger.getLogger(JsonParser.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
/*    
    private void jsonParse()
    {
        JSONArray tasksArray = new JSONArray();
        for(Order t : taskList)
        {
            JSONObject item = new JSONObject();
            try 
            {
                item.put("hour", t.getHour());
                item.put("min", t.getMin());
                item.put("sec", t.getSec());
                item.put("repeat", t.isRepeat());
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }

            
            if(Download.class.isInstance(t.getAction()))
            {
                Download d = (Download)t.getAction();
                
                try
                {
                    item.put("action", "download");
                    item.put("url", d.getUrl());
                    item.put("output", d.getOutput());
                    item.put("user", d.getUser());
                    item.put("pass", d.getPass());
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            
            if(Mix.class.isInstance(t.getAction()))
            {
                Mix m = (Mix)t.getAction();
                
                try
                {
                    item.put("action", "mix");
                    item.put("duration", m.getDuration());
                    item.put("output", m.getOutput());
                
                    JSONArray dlyArr = new JSONArray();
                    for(int dly : m.getDelays())
                    {
                        dlyArr.put(dly);
                    }
                    item.put("delay", dlyArr);

                    JSONArray inputArr = new JSONArray();
                    for(String input : m.getInputs())
                    {
                        inputArr.put(input);
                    }
                    item.put("input", inputArr);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }   
            
            if(Concat.class.isInstance(t.getAction()))
            {
                Concat c = (Concat)t.getAction();
                
                try
                {
                    item.put("action", "cct");
                    item.put("input1", c.getInput1());
                    item.put("input2", c.getInput2());
                    item.put("output", c.getOutput());
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            
            if(ShellCmd.class.isInstance(t.getAction()))
            {
                ShellCmd s = (ShellCmd)t.getAction();
                
                try
                {
                    item.put("action", "cmd");
                    item.put("cmd", s.getCmd());
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }     
            
            if(Split.class.isInstance(t.getAction()))
            {
                Split s = (Split)t.getAction();
                
                try
                {
                    item.put("action", "split");
                    item.put("input", s.getInput());
                    item.put("output", s.getOutput());
                    item.put("minSilenceLength", s.getMinSilenceLength());
                    item.put("silenceBorder", s.getSilenceBorder());                            
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            
            tasksArray.put(item);
        }
        

        
        try {
            json.put("tasks", tasksArray);
        } catch (JSONException ex) {
            Logger.getLogger(JsonParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/
    public String getJson() 
    {
        return json.toString() + "\n";
    } 

    public LinkedList<Order> getTaskList() {
        return taskList;
    }
    
    
}
