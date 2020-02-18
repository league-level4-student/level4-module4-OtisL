package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived=0; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned=0; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	static EncapsulateTheData ee = new EncapsulateTheData();
	Object tester;
	@Test
	public void testItems() {
		ee.setItemsReceived(-33);
		assertEquals(0, ee.getItemsReceived());
		ee.setItemsReceived(12);
		assertEquals(12, ee.getItemsReceived());
	}
	@Test
	public void testDegrees() {
		ee.setDegreesTurned(543);
		assertEquals(0, ee.getDegreesTurned());
		ee.setDegreesTurned(33);
		assertEquals(33, ee.getDegreesTurned());
	}
	@Test
	public void testNomenclature() {
		ee.setNomenclature("");
		assertEquals(" ", ee.getNomenclature());
		ee.setNomenclature("ssg");
		assertEquals("ssg", ee.getNomenclature());
	}
	@Test
	public void testObj() {
		ee.setMemberObj(0);
		assertEquals(0, ee.getMemberObj());
		ee.setMemberObj("fjdhtg");
		assertEquals(tester, ee.getMemberObj());
	}
	void setItemsReceived(int itemsRecieved) {
		if(itemsRecieved<0) {
			this.itemsReceived=0;
		}else {
			this.itemsReceived=itemsRecieved;
		}
	}
	int getItemsReceived() {
		return itemsReceived;
	}
	void setDegreesTurned(float degreesTurned) {
		if(degreesTurned>=0 && degreesTurned<=360) {
			this.degreesTurned=degreesTurned;
		}
	}
	float getDegreesTurned() {
		return this.degreesTurned;
	}
	void setNomenclature(String nomenclature) {
		if(nomenclature.contentEquals("")) {
			this.nomenclature=" ";
		}else {
			this.nomenclature=nomenclature;
		}
	}
	String getNomenclature() {
		return this.nomenclature;
	}
	void setMemberObj(Object memberObj) {
		if(memberObj instanceof String) {
			this.memberObj=tester;
		}else {
			this.memberObj=memberObj;
		}
	}
	Object getMemberObj() {
		return this.memberObj;
	}
}
