import java.lang.Math;

public class CreditPaymentService {

    public double calculate(int sum, float pcnt, int time) {

        pcnt = pcnt / 1200;
        float pcntTmp = pcnt + 1;
        int timeInMonth = time * 12;
        double monthPayment = sum * pcnt * Math.pow(pcntTmp, timeInMonth) / (Math.pow(pcntTmp, timeInMonth) - 1);
        return monthPayment;
    }
}
