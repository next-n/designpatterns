package com.newnext.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

import com.newnext.designpatterns.observerpattern.payment.PaymentInterface;
import com.newnext.designpatterns.observerpattern.payment.process.CreditCardPaymentProcess;
import com.newnext.designpatterns.observerpattern.payment.process.OnlineAccountPaymentProcess;

import lombok.RequiredArgsConstructor;
/**
 * @author newnext
 */
@RequiredArgsConstructor
public class PaymentManager implements PaymentSubject{
	/**
	 * This Listeners List is built for Observer/Listeners Pattern.
	 * @author newnext
	 */
	private final List<AfterPayListenerInterface> afterpayListeners = new ArrayList<>();
	
	
	private final PaymentInterface paymentInterface;
	private final CreditCardPaymentProcess creditpaymentprocess = CreditCardPaymentProcess.getInstance();
	private final OnlineAccountPaymentProcess onlinepaymentprocess = OnlineAccountPaymentProcess.getInstance();

	

	public void makepay() throws Exception {
		if (creditpaymentprocess.supports(paymentInterface.getClass())){
			
			creditpaymentprocess.makepay(paymentInterface);
		}
		else if (onlinepaymentprocess.supports(paymentInterface.getClass())) {
			
			onlinepaymentprocess.makepay(paymentInterface);
		}
		
	}
	public void afterpay() {
		afterpayListeners.forEach(AfterPayListenerInterface::makeafterpay);
	}
	public void addlistener(AfterPayListenerInterface a) {
		this.afterpayListeners.add(a);
	}
	public void removeListener(AfterPayListenerInterface a) {
		this.afterpayListeners.remove(a);
	}
	@Override
	public int getAmount() {
		return this.paymentInterface.getAmount();
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return this.paymentInterface.getMethod().toString();
	}

}
