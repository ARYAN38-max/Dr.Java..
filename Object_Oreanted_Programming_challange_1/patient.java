package Object_Oreanted_Programming_challange_1;

public class patient {
    private String name;
    private int age;
    private eye leftEye;
    private eye rightEye;
    private heart heart;
    private skin skin;
    private stomach stomach;

    public patient(String name,int age,eye leftEye,eye rightEye,heart heart,skin skin,stomach stomach){
        this.name = name;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.age = age;
        this.heart = heart;
        this.skin = skin;
        this.stomach = stomach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(eye leftEye) {
        this.leftEye = leftEye;
    }

    public eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(eye rightEye) {
        this.rightEye = rightEye;
    }

    public heart getHeart() {
        return heart;
    }

    public void setHeart(heart heart) {
        this.heart = heart;
    }

    public skin getSkin() {
        return skin;
    }

    public void setSkin(skin skin) {
        this.skin = skin;
    }

    public stomach getStomach() {
        return stomach;
    }

    public void setStomach(stomach stomach) {
        this.stomach = stomach;
    }
}
