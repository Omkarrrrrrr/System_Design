public class SystemDesign1{
    public static void main(String[] args) {
        //game design
        boolean jump = true;
        boolean run = true;
        boolean fly = false;
        boolean weapon = false;

        // God mode - all 4 powers
        // Legend mode - run and  weapon 
        // else Regular mode

        // Bad implementation - complex code
        if(jump==true){
            if(run==true){
                if(fly==true){
                    if(weapon==true){
                        System.out.println("God mode activated");
                    }
                }
            }
        }
        else if(run==true){
            if(weapon==true){
                System.out.println("Legend mode activated");
            }
        }
        else{
            System.out.println("Regular mode activated");
        }


        //Good  implementation
        if(jump && run && fly && weapon){
            System.out.println("God mode activated");
        }
        else if(run && weapon){
            System.out.println("Legend mode activated");
        }
        else{
            System.out.println("Regular mode activated");
        }

    }
}