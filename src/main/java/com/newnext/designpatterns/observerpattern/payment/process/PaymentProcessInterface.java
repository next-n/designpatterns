package com.newnext.designpatterns.observerpattern.payment.process;

import com.newnext.designpatterns.observerpattern.payment.CreditCardPayment;
import com.newnext.designpatterns.observerpattern.payment.PaymentInterface;

public interface PaymentProcessInterface {
	void makepay(PaymentInterface pi) throws Exception;
	boolean supports(Class<?> payment);
	

}
