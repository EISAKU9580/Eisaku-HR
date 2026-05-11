package Mynameis;

public class Person {
	String name;
	int age;
	double height;
	double weight;
    static int count = 0;
	

    Person(String name, int age, double height,  double weight){
		this.name = "井上英作";
		this.age = 25;
		this.height = 171;
		this.weight = 75;
		count++;
	  }
  

	double bmi() {
        return this.weight / (this.height * this.height);
    }
        
	void print() {
        System.out.println("名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "mです");
        System.out.println("BMIは" + this.bmi() + "です");
    }
}
