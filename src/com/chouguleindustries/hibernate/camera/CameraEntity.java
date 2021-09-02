package com.chouguleindustries.hibernate.camera;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera_table")

public class CameraEntity implements Serializable {
	@Column(name = "c_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_price")
	private double price;
	@Column(name = "c_warrenty")
	private int warrenty;
	@Column(name = "c_filters")
	private int noOfFiltersEffect;
	@Column(name = "c_wifi")
	private boolean isWIFI;
	@Column(name = "c_type")
	private String type;
	@Column(name = "c_country")
	private String countryOfOrigin;
	@Column(name = "c_weight")
	private float weight;
	@Column(name = "c_focus")
	private boolean isAutoFocus;
	@Column(name = "c_flash")
	private String flashModes;

	public CameraEntity() {

	}

	public CameraEntity(int id, double price, int warrenty, int noOfFiltersEffect, boolean isWIFI, String type,
			String countryOfOrigin, float weight, boolean isAutoFocus, String flashModes) {
		super();
		this.id = id;
		this.price = price;
		this.warrenty = warrenty;
		this.noOfFiltersEffect = noOfFiltersEffect;
		this.isWIFI = isWIFI;
		this.type = type;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
		this.isAutoFocus = isAutoFocus;
		this.flashModes = flashModes;
	}

	public CameraEntity(double price, int warrenty, int noOfFiltersEffect, boolean isWIFI, String type,
			String countryOfOrigin, float weight, boolean isAutoFocus, String flashModes) {
		super();
		this.price = price;
		this.warrenty = warrenty;
		this.noOfFiltersEffect = noOfFiltersEffect;
		this.isWIFI = isWIFI;
		this.type = type;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
		this.isAutoFocus = isAutoFocus;
		this.flashModes = flashModes;
	}

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", price=" + price + ", warrenty=" + warrenty + ", noOfFiltersEffect="
				+ noOfFiltersEffect + ", isWIFI=" + isWIFI + ", type=" + type + ", countryOfOrigin=" + countryOfOrigin
				+ ", weight=" + weight + ", isAutoFocus=" + isAutoFocus + ", flashModes=" + flashModes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
		result = prime * result + ((flashModes == null) ? 0 : flashModes.hashCode());
		result = prime * result + id;
		result = prime * result + (isAutoFocus ? 1231 : 1237);
		result = prime * result + (isWIFI ? 1231 : 1237);
		result = prime * result + noOfFiltersEffect;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + warrenty;
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CameraEntity other = (CameraEntity) obj;
		if (countryOfOrigin == null) {
			if (other.countryOfOrigin != null)
				return false;
		} else if (!countryOfOrigin.equals(other.countryOfOrigin))
			return false;
		if (flashModes == null) {
			if (other.flashModes != null)
				return false;
		} else if (!flashModes.equals(other.flashModes))
			return false;
		if (id != other.id)
			return false;
		if (isAutoFocus != other.isAutoFocus)
			return false;
		if (isWIFI != other.isWIFI)
			return false;
		if (noOfFiltersEffect != other.noOfFiltersEffect)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (warrenty != other.warrenty)
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}

	public int getNoOfFiltersEffect() {
		return noOfFiltersEffect;
	}

	public void setNoOfFiltersEffect(int noOfFiltersEffect) {
		this.noOfFiltersEffect = noOfFiltersEffect;
	}

	public boolean isWIFI() {
		return isWIFI;
	}

	public void setWIFI(boolean isWIFI) {
		this.isWIFI = isWIFI;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isAutoFocus() {
		return isAutoFocus;
	}

	public void setAutoFocus(boolean isAutoFocus) {
		this.isAutoFocus = isAutoFocus;
	}

	public String getFlashModes() {
		return flashModes;
	}

	public void setFlashModes(String flashModes) {
		this.flashModes = flashModes;
	}

}
