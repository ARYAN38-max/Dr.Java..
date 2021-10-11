package Object_Oreanted_Programming_challange_1;

public class orgain {
    private String name;
    private String condition;
    public orgain(String name,String condition){
        this.name = name;
        this.condition = condition;
    }
    //details
    public void getDetails(){
        System.out.println("Name :" + this.getname());
        System.out.println("Medicial Condition :"+this.getcondition());
    }
    //name of the orgain
    public String getname(){
        return this.name;
    }

    public void setname(String name){
        this.name = name;
    }
    //condition
    public String getcondition(){
        return this.condition;
    }

    public void setcondition(String condition){
        this.condition = condition;
    }
    
}
