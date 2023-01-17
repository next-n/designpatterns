package com.newnext.designpatterns.observerpattern;

import lombok.AllArgsConstructor;
/**
 * @author newnext
 */
@AllArgsConstructor
public class PaymentEvent {
	private final PaymentSubject ps;
	public int getAmount() {
		return ps.getAmount();
	}
	public String getMehod() {
		return ps.getMethod();
	}

}
