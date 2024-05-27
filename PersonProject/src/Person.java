public class Person {
    private String name;
    private int age;
    private boolean legal;
    private int weight;
    private int height;

    public Person(String name){
        this.name = name;
        this.age =0;
        this.height = 0;
        this.weight = 0;
    }
    public int growOlder(){
        this.age = this.age + 1;
        return this.age;
    }
    public int returnAge(){
        return this.age;
    }
    public boolean isOfLegalAge(){
       if(this.age > 18){
        legal = true;
        return legal;
       } else {
        legal = false;
        return legal;
       }
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public double bodyMassIndex(){
        double heightPerHundred = this.height / 100.00;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    public String toString() {
        return this.name + ", age " + this.age + " years, " + this.bodyMassIndex() + ", bodyMassIndex";
    }
}

//gonna recommmit dis
