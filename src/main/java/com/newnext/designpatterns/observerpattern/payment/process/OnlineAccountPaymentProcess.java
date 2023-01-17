package com.newnext.designpatterns.observerpattern.payment.process;

import com.newnext.designpatterns.observerpattern.payment.OnlinePayment;
import com.newnext.designpatterns.observerpattern.payment.PaymentInterface;
/**
 * Singleton By getInstance method and private constructor
 * @author newnext
 *
 */
public class OnlineAccountPaymentProcess implements PaymentProcessInterface{
	private static class SingletonHolder{
		private static final OnlineAccountPaymentProcess singleton = new OnlineAccountPaymentProcess();
	}
	
	private OnlineAccountPaymentProcess() {
		
	}

	@Override
	public boolean supports(Class<?> payment) {
		// TODO Auto-generated method stub
		return OnlinePayment.class.equals(payment);
	}

	@Override
	public void makepay(PaymentInterface onlinePayment) throws Exception {
		if (onlinePayment.getAmount()>100) {
			throw new Exception();
		}
		System.out.println("Processing Payment By Online, Amount is " + onlinePayment.getAmount());
		
		
	}
	public static OnlineAccountPaymentProcess getInstance() {
		return SingletonHolder.singleton;	
	}

}
