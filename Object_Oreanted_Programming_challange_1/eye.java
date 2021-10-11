package Object_Oreanted_Programming_challange_1;

public class eye extends orgain{
    private String color;
    private Boolean isOpened;
    public eye(String name, String condition,String color,boolean isOpened) {
        super(name, condition);
        this.color = color;
        this.isOpened = isOpened;
        
    }
    public void open(){
        this.setIsOpened(true);
        System.out.println(this.getname()+" opened");
    }
    public void close(){
        this.setIsOpened(false);
        System.out.println(this.getname()+" closed");
    }
    @Override 
    public void getDetails(){
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean getIsOpened() {
        return isOpened;
    }
    public void setIsOpened(Boolean isOpened) {
        this.isOpened = isOpened;
    }
    
    }

    

    

