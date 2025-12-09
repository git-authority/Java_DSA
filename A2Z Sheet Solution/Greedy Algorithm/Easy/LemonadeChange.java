public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {

        int five = 0, ten = 0, twenty = 0;

        for(int bill:bills){
            if(bill == 5){
                five++;
            }
            else if(bill == 10){
                if(five == 0){
                    return false;
                }
                ten++;
                five--;
            }
            else{


                /* Using 10$ + 5$ saves our 5$ bills
                   so we don't get stuck later
                */


                // If no 10 exists, go for 5+5+5
               if(ten == 0){
                    if(five < 3){
                        return false;
                    }
                    else{
                        five-=3;
                    }
                }
                // If 10 exists, check for 5
                else{
                    if(five==0){
                        return false;
                    }
                    else{
                        ten--;
                        five--;
                    }
                }
                twenty++;
            }

        }

        return true;

    }
}