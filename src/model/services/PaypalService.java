package model.services;

public class PaypalService implements OnlinePaymentService {
	
	@Override
	public Double interest(double amount, Integer months) {
		double result = amount + (amount * 0.01);
		for (int i=1; i <= months; i++) {
			 result *= i;
		}
		return result;
	}
	
	@Override
	public Double paymentFee(double amount) {
		double quota = interest(amount, null) + (interest(amount, null) * 0.02);
		return quota;
	}

}
