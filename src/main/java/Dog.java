public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("woof, woof");
    }

    @Override
    public boolean eat(String foodType) {
        return false;
    }
}
