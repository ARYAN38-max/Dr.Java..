package Object_Oreanted_Programming_challange_1;

public class heart extends orgain{
    private int rate;
    public heart(String name, String condition,int rate) {
        super(name, condition);
        this.rate = rate;
        
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Heart rate "+ this.getrate());
    }
    public int getrate(){
        return this.rate;
    }
    public void setrate(int rate){
        this.rate = rate;
    }

    
}
