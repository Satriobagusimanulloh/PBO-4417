import java.util.Stack;

class Zoo {
    Stack<String> animal = new Stack<String>();

    public Zoo() {

    }
    public Stack<String> getAnimal() {
        return animal;
    }
    public void setAnimal(Stack<String> animal) {
        this.animal = animal;
    }
}

class Animal extends Zoo {

    public Animal() {

    }
    public boolean isCollectionAnimalEmpty() {
        return super.getAnimal().isEmpty();
    }
    public void addAnimal(String animal) {
        super.getAnimal().push(animal);
    }
    public String removeAnimal() {
        if (isCollectionAnimalEmpty()) {
            return null;
        }
        else {
            return super.getAnimal().pop();
        }
    }
    public String peekAnimal() {
        if (isCollectionAnimalEmpty()){
            return null;
        } else {
            return super.getAnimal().peek();
        }
    }
    public int sizeAnimal() {
        return super.getAnimal().size();
    }
    public void exchangeAnimal(int index, String animal) {
        super.getAnimal().set(index, animal);
    }
    public Stack<String> collectionAnimal() {
        return super.getAnimal();
    }
}

public class Pewarisan_Stack {
    public static void main(String[] args) {
        Animal hewan = new Animal();
        System.out.println(hewan.collectionAnimal());
        System.out.println("Is Animal Collection Empty ? : " + hewan.isCollectionAnimalEmpty());
        System.out.println("Size of Collection Animal : " + hewan.sizeAnimal());
        System.out.println();

        hewan.addAnimal("Kuda");
        hewan.addAnimal("Dinosaurus");
        hewan.addAnimal("Burok");
        System.out.println(hewan.collectionAnimal());
        System.out.println("Is Animal Collection Empty ? : " + hewan.isCollectionAnimalEmpty());
        System.out.println("Size of Collection Animal : " + hewan.sizeAnimal());
        System.out.println();

        hewan.exchangeAnimal(0, "Jerapah");
        System.out.println(hewan.collectionAnimal());
        System.out.println("Top of Animal Collection : " + hewan.peekAnimal());
        System.out.println("Size of Collection Animal : " + hewan.sizeAnimal());
        System.out.println();

        hewan.removeAnimal();
        hewan.removeAnimal();
        hewan.removeAnimal();
        hewan.removeAnimal();
        System.out.println(hewan.collectionAnimal());
        System.out.println("Top of Animal Collection : " + hewan.peekAnimal());
        System.out.println("Size of Collection Animal : " + hewan.sizeAnimal());
    }
}