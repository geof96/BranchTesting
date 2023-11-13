public class Cat extends Animal {
    private String name;

    @Override
    public void makeSound(){
        System.out.println("miav, miav");
    }

    @Override
    public boolean eat(String foodType) {
        return false;
    }
}
