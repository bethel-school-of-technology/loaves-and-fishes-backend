package com.loavesandfish.needposts;


import java.time.LocalDateTime;

=======

import javax.persistence.*;

@Entity
@Table(name="post")
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String postContent;
private String city;
private String category;
private Integer amount;
private String email;
private String phoneNumber;
private LocalDateTime timestamp;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPostContent() {
	return postContent;
}
public void setPostContent(String postContent) {
	this.postContent = postContent;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
} 
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.name = phoneNumber;

}
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}

}
