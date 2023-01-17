package com.newnext.designpatterns.observerpattern;

import com.newnext.designpatterns.observerpattern.payment.CreditCardPayment;
import com.newnext.designpatterns.observerpattern.payment.OnlinePayment;
import com.newnext.designpatterns.observerpattern.payment.process.OnlineAccountPaymentProcess;

public class MainClassObserver {

	public static void main(String[] args) {
//		System.out.println(OnlineAccountPaymentProcess.SingletonHolder.class.getClassLoader());
		CreditCardPayment creditpayment = new CreditCardPayment(100);
		OnlinePayment onlinePayment = new OnlinePayment(90);
		PaymentManager paymentManager = new PaymentManager(onlinePayment);
		try {
			paymentManager.makepay();
			PaymentEvent paymentEvent = new PaymentEvent(paymentManager);
			PaySuccessListener paySuccessListener = new PaySuccessListener(paymentEvent);
			paymentManager.addlistener(paySuccessListener);
		}catch (Exception e) {
			PaymentEvent paymentEvent = new PaymentEvent(paymentManager);
			paymentManager.addlistener(new PayFailureListener(paymentEvent));
			
		}
		paymentManager.afterpay();
		
	}

}
