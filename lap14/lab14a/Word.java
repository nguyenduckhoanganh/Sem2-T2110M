package lap14.lab14a;

public class Word {
    private String value;
    private int position;
    public Word(String v,int p){
        value=v;
        position=p;
    }
    public String getValue(){
        return value;
    }
    public int getPosition(){
        return position;
    }
}
