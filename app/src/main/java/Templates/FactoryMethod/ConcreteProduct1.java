package main.java.Templates.FactoryMethod;

public class ConcreteProduct1 implements IProduct{
    @Override
    public void create() {
        System.out.println("Creando ConcreteProduct1");
    }
}