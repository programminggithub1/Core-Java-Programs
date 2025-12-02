package AbstractANDToString;

abstract class OnlinePaymentSystem {
    String paymentId;
    double amount;
    String payerName;
    String status = "PENDING";
    OnlinePaymentSystem()//default constructor
    {
    	paymentId="upi1034";
    	amount=4567;
    	payerName="sanika";
    }
    OnlinePaymentSystem(String paymentId, double amount, String payerName) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.payerName = payerName;
    }

    void printSummary() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Payer Name: " + payerName);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
    }

    final void process() {
        if(validate()) {
            deductAmount();
            sendNotification();
            status = "SUCCESS";
        } else {
            status = "FAILED";
            System.out.println("Payment validation failed!");
        }
    }

    abstract boolean validate();
    abstract void deductAmount();
    abstract void sendNotification();
}

class CardPayment extends OnlinePaymentSystem {
    String cardNumber;
    String cvv;
    CardPayment()//default constructor
    {
    	super();
    	cardNumber="card1234";
    	cvv="456";
    }
    CardPayment(String paymentId, double amount, String payerName, String cardNumber, String cvv) {
        super(paymentId, amount, payerName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
//setter and getters
    String getCardNumber() {
		return cardNumber;
	}

	 void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	 String getCvv() {
		return cvv;
	}

	 void setCvv(String cvv) {
		this.cvv = cvv;
	}
    boolean validate() {
        if(cardNumber.length() == 16 && cvv.length() == 3 && amount > 0) {
            return true;
        }
        return false;
    }

	void deductAmount() {
        System.out.println("Deducting Rs." + amount + " from card " + cardNumber);
    }

    void sendNotification() {
        System.out.println("Notification sent to " + payerName + " for card payment.");
    }
}

class UPIPayment extends OnlinePaymentSystem {
    String upiId;
    UPIPayment()//default constructor
    {
    	super();
    	upiId="upi1034";
    }
    UPIPayment(String paymentId, double amount, String payerName, String upiId) //parameter constructor
    {
        super(paymentId, amount, payerName);
        this.upiId = upiId;
    }
//setters and getters
     String getUpiId() {
		return upiId;
	}

	 void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	boolean validate() {
        return upiId.contains("@") && amount >= 1 && amount <= 100000;
    }

    void deductAmount() {
        System.out.println("Deducting Rs." + amount + " via UPI " + upiId);
    }

    void sendNotification() {
        System.out.println("Notification sent to " + payerName + " for UPI payment.");
    }
}

 class DemoOnlinePaymentSystem {
    public static void main(String[] args) {
    	OnlinePaymentSystem p1;
        p1 = new CardPayment("C001", 1500, "Shweta", "1234567890123456", "123");
        p1.process();
        p1.printSummary();
        System.out.println("\n");
        p1 = new UPIPayment("U001", 5000, "Rahul", "rahul@upi");
        p1.process();
        p1.printSummary();
    }
}
