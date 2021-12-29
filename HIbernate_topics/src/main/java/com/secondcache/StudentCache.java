package com.secondcache;


import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity               //__________ after this annotaions hibernate will understand i have to treat this student class as entity

//@Table(name="students")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)// now hibernate second level cache is enabled 
public class StudentCache {
	@Id  //________________this annotations will make this column as primary key____________________//
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String name;
	private  String city;
	
	
	//private Certificate certi;
	
	public StudentCache() {
		super();
	}
	public StudentCache( String name, String city) {
		this.name = name;
		this.city = city;
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
	
	
	public String getCity() {
		return city;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
    
	
//	public Certificate getCerti() {
//		return certi;
//	}
//	public void setCerti(Certificate certi) {
//		this.certi = certi;
//	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	
	
}
