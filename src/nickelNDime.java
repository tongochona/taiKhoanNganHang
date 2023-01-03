public class nickelNDime extends account {
    public nickelNDime(double a){
        super(a);
    }
    public double charge=0;
    public boolean withdraw(double tien){
        if(super.withdraw(tien)){
            charge+=2;
            return true;
        }
        return false;
    }
    public double endMonthCharge(){
        return charge;
    }

}
