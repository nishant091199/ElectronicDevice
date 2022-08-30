package com.Elect.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Devices_Elect")
public class Device {
	@Id
	@GeneratedValue
private int id;
private String name;
private String category;
private double price;
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
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Device(int id, String name, String category, double price) {
	super();
	this.id = id;
	this.name = name;
	this.category = category;
	this.price = price;
}
@Override
public String toString() {
	return "Device [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
}

}
