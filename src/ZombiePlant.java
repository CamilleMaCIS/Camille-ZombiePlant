public class ZombiePlant {
    //properties
    private int maxPotency;
    private int initTreatments;

    //constructor
    public ZombiePlant(int mP, int iT){
        this.maxPotency = mP;
        //maxPotency is final and not changed
        this.initTreatments = iT;
    }

    //methods
    public int getPotencyRequired(){
        return maxPotency;
    }
    public int treatmentsNeeded(){
        return initTreatments;
    }

    public void treat(int newTreatment){
        //does nothing if input is 0 or negative
        if (newTreatment <= 0){
            initTreatments+= 0;
        }

        else if (newTreatment <= maxPotency){
            if (initTreatments > 0){
                initTreatments--;
            }
        }

        else{
            initTreatments++;
        }
    }

    public boolean isDangerous(){
        //if plant needs at least 1 treatment still, yes it is dangerous
        if (initTreatments > 0){
            return true;
        }

        return false;
    }

}
