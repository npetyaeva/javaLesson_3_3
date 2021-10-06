## Урок 3. Задача №3

Расчет аннуитетного платежа

[Ссылка на код Main.java](https://github.com/npetyaeva/javaLesson_3_3/blob/master/src/Main.java)

```java
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        int sumCredit = 1_000_000;
        float pcntCredit = 9.99F;
        //int timeCredit = 3;

        DecimalFormat df = new DecimalFormat("###,###,###");

        CreditPaymentService monthPayments = new CreditPaymentService();
        double monthPayment; // = monthPayments.calculate(sumCredit, pcntCredit, timeCredit);

        for (int timeCredit = 1; timeCredit <=3; timeCredit++) {

            monthPayment = monthPayments.calculate(sumCredit, pcntCredit, timeCredit);

            System.out.println("Сумма кредита: " + df.format(sumCredit) + " руб.");
            System.out.println("Процентная ставка: " + pcntCredit + "%");
            switch (timeCredit) {
                case 1:
                    System.out.println("Срок кредита: 1 год");
                    break;
                default:
                    System.out.println("Срок кредита: " + timeCredit + " года");
            }

            System.out.println("Ежемесячный платеж: " + df.format((int) monthPayment * 100 / 100) + " руб.\n");
        }
    }
}
```

[Ссылка на код CreditPaymentService.java](https://github.com/npetyaeva/javaLesson_3_3/blob/master/src/CreditPaymentService.java)

```java
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
```
