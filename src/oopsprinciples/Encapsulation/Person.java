/**
 * 
 */
package oopsprinciples.Encapsulation;

/**
 * 
 * Encapsulation is the concepts of bundling the data(variables)and code(method) that 
 * manipulate the data within a single unit, like a class.
 * 
 * It also invokes restricting that manipulate to some components to enforce data hiding.
 * 
 * By using access modifiers(public, private, protected)
 * 
 * @author Phanindra Maroju
 * 
 */
public class Person {

	
	private String name;
	private int age;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age > 0) {  // Basic validation to ensure age is positive
            this.age = age;
        }
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Phanindra");
		person.setAge(25);
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}

}
