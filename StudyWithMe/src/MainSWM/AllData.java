package MainSWM;

import decorClass.TaskPattern;
import java.io.Serializable;
import java.util.ArrayList;
import javaant.TaskData;

/**
 *
 * @author Admin
 */
public class AllData<T> implements Serializable{
    private T data;
    //ArrayList<TaskPattern> tasklist;
    ArrayList<TaskData> taskdatalist;
    //ArrayList<something> notelist;
    public T getdata() {
        return data;
    }
    public void setdata(T data){
        this.data = data;
    }
    
    public void setTaskdatalist(ArrayList taskdatalist){
        this.taskdatalist = taskdatalist;
    }
    public void setNotelist(ArrayList notelist){
        //this.notelist = notelist;
    }/*
    public ArrayList<TaskPattern> getTasklist(){
        return tasklist;
    }*/
    public ArrayList<TaskData> getTaskdatalist(){
        return taskdatalist;
    }/*
    public ArrayList<something> getNotelist(){
        return notelist;
    }*/
}
