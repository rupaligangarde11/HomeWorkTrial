public class Call {
    public void invoke(Printable p){
        if(p instanceof Animal) {
            Animal animal = (Animal) p;
            animal.printAnimal();
        }
        if(p instanceof Demo){
            Demo demo = (Demo) p;
            demo.printDemo();
        }
    }

}
