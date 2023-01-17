package com.newnext.designpatterns.observerpattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PayFailureListener implements AfterPayListenerInterface{
	private final PaymentEvent pe;

	@Override
	public void makeafterpay() {
		failure();
		
	}
	private void failure() {
		System.out.println("Payment failed. Payment is paid by " + pe.getMehod() + ". Try Another");
	}

}
