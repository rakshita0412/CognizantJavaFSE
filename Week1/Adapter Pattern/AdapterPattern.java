interface PaymentProcessor {
    void processPayment(double amount);
}
class ZPayGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through ZPay.");
    }
}


class QuickPayGateway {
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " through QuickPay.");
    }
}


class FastFundsGateway {
    public void process(double amount) {
        System.out.println("Processing payment of $" + amount + " through FastFunds.");
    }
}
class ZPayAdapter implements PaymentProcessor {
    private ZPayGateway zPayGateway;

    public ZPayAdapter() {
        this.zPayGateway = new ZPayGateway();
    }

    @Override
    public void processPayment(double amount) {
        zPayGateway.makePayment(amount);
    }
}

class QuickPayAdapter implements PaymentProcessor {
    private QuickPayGateway quickPayGateway;

    public QuickPayAdapter() {
        this.quickPayGateway = new QuickPayGateway();
    }

    @Override
    public void processPayment(double amount) {
        quickPayGateway.pay(amount);
    }
}

class FastFundsAdapter implements PaymentProcessor {
    private FastFundsGateway fastFundsGateway;

    public FastFundsAdapter() {
        this.fastFundsGateway = new FastFundsGateway();
    }

    @Override
    public void processPayment(double amount) {
        fastFundsGateway.process(amount);
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {
        PaymentProcessor zPayProcessor = new ZPayAdapter();
        PaymentProcessor quickPayProcessor = new QuickPayAdapter();
        PaymentProcessor fastFundsProcessor = new FastFundsAdapter();

        zPayProcessor.processPayment(150.90);
        quickPayProcessor.processPayment(175.75);
        fastFundsProcessor.processPayment(250.00);
    }
}
