package com.newnext.designpatterns.observerpattern.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OnlinePayment implements PaymentInterface {
	private final int amount;

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return this.amount;
	}

	@Override
	public PaymentMethod getMethod() {
		// TODO Auto-generated method stub
		return PaymentMethod.ONLINE;
	}

}
