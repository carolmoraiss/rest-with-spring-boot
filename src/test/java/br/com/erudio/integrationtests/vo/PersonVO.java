package br.com.erudio.integrationtests.vo;



import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Getter
public class PersonVO  implements Serializable {

	private static final long serialVersionUID = 1L;


	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String gender;
	
	public PersonVO() {}


	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonVO personVO = (PersonVO) o;
		return Objects.equals(id, personVO.id) && Objects.equals(firstName, personVO.firstName) && Objects.equals(lastName, personVO.lastName) && Objects.equals(address, personVO.address) && Objects.equals(gender, personVO.gender);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, address, gender);
	}

	@Override
	public String toString() {
		return "PersonVO{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", address='" + address + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}