package org.springframework.tests.sample.beans;

/**
 * @author xukangkang
 * @description: TODO
 * @date 2019/9/3 16:33
 */
public class Person {
	private String name;
	private Person friend;
	private Integer age;
	private String sex;
	private String hobby;
	private Float height;
	public Person(){

	}
	public Person(Person friend,String name){
		this.friend = friend;
		this.name = name;
	}
/*	public Person(String sex,String hobby,Float height){
		this.sex = sex;
		this.hobby = hobby;
		this.height = height;
	}
	public Person(String name){
		this.name = name;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getFriend() {
		return friend;
	}

	public void setFriend(Person friend) {
		this.friend = friend;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "name : " + name;
	}
}
