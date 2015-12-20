public class Demo extends Animal {



    public static void main(String args[]){
        Animal demo = new Demo();
        Demo.methodDemo(demo);
    }

    private static void methodDemo(Animal demo) {
        if(demo instanceof Demo){
            Demo d = (Demo) demo;
            System.out.println("its called downcasting :)");
        }
    }
}

