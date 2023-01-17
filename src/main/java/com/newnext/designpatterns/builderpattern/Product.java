package com.newnext.designpatterns.builderpattern;

public class Product {
	private int id;
	private String name;
	private String brand;
	public Product() {
		super();
	}
	public static class Builder{
		public Builder() {
			
		}
		private Product p = new Product();
		public Builder id(int id) {
			this.p.id = id;
			return this;
		}
		public Builder name(String name) {
			this.p.name = name;
			return this;
		}
		public Builder brand(String brand) {
			this.p.brand = brand;
			return this;
		}
		public Product build() {
			return this.p;
		}
	}
	public static Builder builder() {
		return new Builder();
	}
	

}
