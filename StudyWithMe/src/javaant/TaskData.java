package javaant;

import java.lang.reflect.Array;

/**
 *
 * @pleng ja
 */
public class TaskData {
    private String taskname = "Your Task";
    private String dmy = "DD/MM/YYYY";
    private String date = "DD";
    private String month = "MM";
    private String year = "YYYY";
    private String description = "Description...";
    private int state = 0;
    //copy from DateChooser
    private final String MONTH_ENGLISH[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public TaskData() {
        this.taskname = "Your Task";
        this.state = 0;
        this.dmy = "DD/MM/YYYY";
        this.description = "Description...";
        
        if (dmy != null) {
            d_m_y = dmy.split("/");
        }
        
    }
    
    private String[] d_m_y;
    
    public String gettaskname() {return taskname;}
    public String getdes() {return description;}
    public int getstate() {return state;}
    public String getdmy() {
        if (!"DD/MM/YYYY".equals(dmy)){
        return dmy;}
        else {
            this.dmy = date+"/"+month+"/"+year;
            return dmy;
        }
    }
    public void settaskname(String taskname){
        this.taskname = taskname;
        System.out.println("[set TaskData]taskname = " + taskname);
    }
    public void setstate(int status){
        this.state = status;
        System.out.println("[set TaskData]state = " + status);
    }
    public void setstate(String status){
        if (status.equals("available")) {
            this.state = 1;
        }
        else if (status.equals("not available")) {
            this.state = 0;
        }
        System.out.println("[set TaskData]state = " + status);
    }
    public void setdmy(String dmy) {
        this.dmy = dmy;
        System.out.println("[set TaskData]dd/mm/yyyy = " + dmy);
    }
    public void setDate(String date) {
        if (date.length() == 1) {
            this.date = "0"+date;
        }else {this.date = date;}
        System.out.println("[set TaskData]dd = " + date);
    }
    public void setMonth(String month) {
        if (month.length() == 1) {
            this.month = "0"+month;
        }else {this.month = month;}
        System.out.println("[set TaskData]mm = " + month);
    }
    public void setYear(String year) {
        if (year.length() == 2) {
            this.year = "20"+year;
        }else {this.year = year;}
        System.out.println("[set TaskData]yyyy = " + year);
    }
    public void setdes(String description) {
        this.description = description;
        System.out.println("[set TaskData]Description = " + description);
    }
    
    public String getDate() {return date;}
    public String getMonth() {return month;}
    public String getYear() {return year;}
    public String[] getdmyArray() {return d_m_y;}
    public String getMonthEN() {return MONTH_ENGLISH[Integer.parseInt(month)-1];}
}
