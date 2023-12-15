package com.tsr.entity;

public class Parcel {
	
	protected int parcelNo;
	protected double charges;
	protected String deliveryType;
	protected String description;
	protected int weight;
	protected int deliveryAssociateNo;
	
	public Parcel() {
		super();
	}

	public Parcel(int parcelNo, double charges, String deliveryType, String description, int weight,
			int deliveryAssociateNo) {
		super();
		this.parcelNo = parcelNo;
		this.charges = charges;
		this.deliveryType = deliveryType;
		this.description = description;
		this.weight = weight;
		this.deliveryAssociateNo = deliveryAssociateNo;
	}

	public int getParcelNo() {
		return parcelNo;
	}

	public void setParcelNo(int parcelNo) {
		this.parcelNo = parcelNo;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDeliveryAssociateNo() {
		return deliveryAssociateNo;
	}

	public void setDeliveryAssociateNo(int deliveryAssociateNo) {
		this.deliveryAssociateNo = deliveryAssociateNo;
	}

	@Override
	public String toString() {
		return "Parcel [parcelNo=" + parcelNo + ", charges=" + charges + ", deliveryType=" + deliveryType
				+ ", description=" + description + ", weight=" + weight + ", deliveryAssociateNo=" + deliveryAssociateNo
				+ "]";
	}
	
}
