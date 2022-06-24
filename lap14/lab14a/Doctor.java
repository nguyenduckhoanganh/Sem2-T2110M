package lap14.lab14a;

public class Doctor  {

    public Doctor(String name, int task){
        this.name=name;
                this.task=task;
    }
    public Doctor(){
    }
    public  int compareTo(Object obj){
        Doctor doc=(Doctor) obj;
        int a = 0;
        int b = 0;
        a = this.task;
        b= doc.task;
        if(a<b) return -1;
        if(a>b) return 1;
        return 0;
    }
    public String toString(){
        return "\nThe Doctor is appointed for = " + name +  "\nThe prority  for the appointment is = " + task ;
    }
    private String name="";
    private int task=0;
}
