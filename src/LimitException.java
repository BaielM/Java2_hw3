public class LimitException extends Exception{
    double remainingAmount;
    public LimitException(String message){
        super(message);
        this.remainingAmount = remainingAmount;
    }
    public double getRemainingAmount(){
        return remainingAmount;
    }
}
