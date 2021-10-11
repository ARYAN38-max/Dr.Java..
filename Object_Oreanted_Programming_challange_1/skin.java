package Object_Oreanted_Programming_challange_1;

public class skin  extends orgain{
    private String color;
    private int softness;
    public skin(String name, String condition, String color, int softness) {
        super(name, condition);
        this.color = color;
        this.softness = softness;
    }
    @Override
    public void getDetails(){
        super.getDetails();

        System.out.println("Skin color :"+this.getcolor());
    }
    //color
    public String getcolor(){
        return this.color;
    }

    public void setcolor(String color){
        this.color = color;
    }
    //softness
    public int getsoftness(){
        return this.softness;
    }

    public void setsoftness(int softness){
        this.softness = softness;
    }
    
}
