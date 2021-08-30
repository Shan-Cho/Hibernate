package com.chouguleindustries.hibernate.bird;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bird_table")
public class BirdEntity implements Serializable {

	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_country")
	private String country;
	@Column(name = "b_length")
	private double length;
	@Column(name = "b_weight")
	private int weight;
	@Column(name = "b_life")
	private int life;
	@Column(name = "b_wingspan")
	private int wingspan;
	@Column(name = "b_migratingplace")
	private String migratingplace;
	@Column(name = "b_size")
	private String size;

	public BirdEntity() {

	}

	public BirdEntity(int id, String name, String color, String country, double length, int weight, int life,
			int wingspan, String migratingplace, String size) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.country = country;
		this.length = length;
		this.weight = weight;
		this.life = life;
		this.wingspan = wingspan;
		this.migratingplace = migratingplace;
		this.size = size;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", color=" + color + ", country=" + country + ", length="
				+ length + ", weight=" + weight + ", life=" + life + ", wingspan=" + wingspan + ", migratingplace="
				+ migratingplace + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + life;
		result = prime * result + ((migratingplace == null) ? 0 : migratingplace.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + weight;
		result = prime * result + wingspan;
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
		BirdEntity other = (BirdEntity) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (life != other.life)
			return false;
		if (migratingplace == null) {
			if (other.migratingplace != null)
				return false;
		} else if (!migratingplace.equals(other.migratingplace))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (weight != other.weight)
			return false;
		if (wingspan != other.wingspan)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public String getMigratingplace() {
		return migratingplace;
	}

	public void setMigratingplace(String migratingplace) {
		this.migratingplace = migratingplace;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
