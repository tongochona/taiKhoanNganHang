
public class normalAccount extends account {
    public normalAccount(double tien){
        super(tien);
    }

    private double charge=10;
    public double endMonthCharge(){
        return charge;
    }
}
