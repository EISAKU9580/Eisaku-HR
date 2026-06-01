package Mynameis;

class Main {
    public static void main(String[] args) {
        Person person = new Person("田中太郎", 30, 1.75, 60);

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);

        person.print();
        
        System.out.println("合計" + Person.count + "人です");
    }
}