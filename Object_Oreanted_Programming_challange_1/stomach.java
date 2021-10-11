package Object_Oreanted_Programming_challange_1;

public class stomach extends orgain{
    private boolean isempty;

    public stomach(String name, String condition, boolean isempty) {
        super(name, condition);
        this.isempty = isempty;
        
    }
    public void digest(){
        System.out.println("digesting is begun");
    }
    @Override
    public void getDetails(){
        super.getDetails();

        if(this.isempty()){
            System.out.println("need to fill");
        }else{
            System.out.println("Your stomach is at good health");
        }
    }
    public boolean isempty(){
        return isempty;
    }
    public boolean getisempty(){
        return this.isempty;
    }
    public void setisempty(boolean isempty){
        this.isempty = isempty;
    }
    
}
