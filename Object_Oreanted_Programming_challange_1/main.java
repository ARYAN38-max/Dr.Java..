package Object_Oreanted_Programming_challange_1;
import java.util.Scanner;  
public class main{
    
        public static void main(String[]args){

        patient patient = new patient("abcd", 12, new eye("left eye","normal","blue",true), new eye("right eye","normal","blue",false),
         new heart("heart","normal",65),new skin("skin","normal","White",50) , new stomach("stomach","normal",true));

         System.out.println("name :"+patient.getName());
         System.out.println("age :"+patient.getAge());

         Scanner scanner = new Scanner(System.in);
         boolean shouldfinish = false;
            while(!shouldfinish){
                System.out.println("Choose an orgain:"+"\n\t1 Left eye"+"\n\t2 Right eye"+"\n\t3 heart"+"\n\t4 skin"+"\n\t5 stomach");
                int choice = scanner.nextInt();
                switch(choice){
                   case 1:
                            patient.getLeftEye().getDetails();
                            if(patient.getLeftEye().getIsOpened()){
                                System.out.println("\t\t1 Close the eye");
                            if(scanner.nextInt()==1){
                                patient.getLeftEye().close();
                            }else{
                                continue;
                            }

                            
                            }else{
                                System.out.println("\t\t1 .Open the eye");
                                if(scanner.nextInt()==1){
                                    patient.getLeftEye().getIsOpened();

                                }else{
                                    continue;
                                }
                            }
                            break;
                 case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().getIsOpened()){
                        System.out.println("\t\t1 Close the eye");
                    if(scanner.nextInt()==1){
                        patient.getRightEye().close();
                    }else{
                        continue;
                    }

                    
                    }else{
                        System.out.println("\t\t1 .Open the eye");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().getIsOpened();

                        }else{
                            continue;
                        }
                    }
                    break;

                 case 3:
                        patient.getHeart().getDetails();
                        System.out.println( "\t\t1 Change the heart rate");
                        if(scanner.nextInt() == 1){
                            System.out.println("Enter a new heart rate");
                            int newHeartRate = scanner.nextInt();
                            patient.getHeart().setrate(newHeartRate);
                            System.out.println("Heart rate changed to "+ patient.getHeart().getrate());
                        }else{
                            continue;
                        }
                        break;
                case 4:
                patient.getSkin().getDetails();
                break;
                case 5:
                       
                        patient.getStomach().getDetails();
                        System.out.println("\t\t1. Digest");
                        if(scanner.nextInt()==1){
                            patient.getStomach().digest();
                        }else{
                            continue;
                        }
                        break;  
                default:
                        shouldfinish = true;
                        break;
            }
        }
}
}
