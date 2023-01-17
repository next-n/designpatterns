package com.newnext.designpatterns.observerpattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaySuccessListener implements AfterPayListenerInterface {
	private final PaymentEvent payment;

	@Override
	public void makeafterpay() {
		success();
		// TODO Auto-generated method stub
		
	}
	private void success() {
		System.out.println("Success Payment Amount is " + payment.getAmount() + ". Paid By " + payment.getMehod());
	}

}
