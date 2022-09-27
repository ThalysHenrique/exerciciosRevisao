package Program1;

// Criar um programa com a Classe: pessoa, Atributos: nome e idade e um método: fazAniversario que não retorne nada
// Método fazAniversario adiciona mais 1 ano a idade atual da pessoa
// Imprimir nome, idade e a nova idade utilizando toString
// Grupo: Thalys Henrique e Levi Oliveira
// Matéria: Programação Orientada a Objetos
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void fazAniversario(){
        System.out.print("Hoje é seu aniversário, parabéns! Idade atual: ");
        System.out.println(age += 1);
    }
    public String toString(){
        return "Nome: " + name +
                ", Idade: " + age;
    }
}
