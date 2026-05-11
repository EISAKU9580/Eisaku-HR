package Mynameis;

class Main {
    public static void main(String[] args) {
        Person person = new Person("田中太郎", 30, 1.75);

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);

        person.printData();
    }
}
