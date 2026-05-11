package Mynameis;

public class Person {
	String name;
	int age;
	double height;
	

    Person(String name, int age, double height){
		this.name = "井上英作";
		this.age = 25;
		this.height = 171;
	  }
	void printData() {
        System.out.println("名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "mです");
    }
}
