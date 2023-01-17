package com.newnext.designpatterns.observerpattern.payment.process;

import com.newnext.designpatterns.observerpattern.payment.CreditCardPayment;
import com.newnext.designpatterns.observerpattern.payment.PaymentInterface;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
/**
 * Singleton By getInstance method and private constructor
 * @author NewNext
 *
 */
public class CreditCardPaymentProcess implements PaymentProcessInterface {
	private static class SingletonHolder{
		private static final CreditCardPaymentProcess singleton = new CreditCardPaymentProcess();
	}
	
	private CreditCardPaymentProcess() {
		
	}
	@Override
	public boolean supports(Class<?> payment) {
		// TODO Auto-generated method stub
		return CreditCardPayment.class.equals(payment);
	}

	@Override
	public void makepay(PaymentInterface creditCardPayment) throws Exception {
		if (creditCardPayment.getAmount()>100) {
			throw new Exception();
		}
		System.out.println("Processing Payment By credit card, Amount is " + creditCardPayment.getAmount());
		// TODO Auto-generated method stub
		
	}
	/**
	 * {@summary} singleton instance
	 * @return this
	 */
	public static CreditCardPaymentProcess getInstance(){
		
		return SingletonHolder.singleton;
		
		
	}

}
