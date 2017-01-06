package static_initializer;

public class InstanceCounter {
    // a static initialization block, executed once when the class is loaded
    static{
        System.out.println("Class InstanceCounter loading...");
    }
    static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;
    static int instanceCounter; // a static field
//    int instanceCounter;
    static{
        System.out.println("ONE_DAY_IN_MILLIS= " + ONE_DAY_IN_MILLIS + " instanceCounter= " + instanceCounter);
    }
//    static{
//        System.out.println("ONE_DAY_IN_MILLIS= " + ONE_DAY_IN_MILLIS + " instanceCounter= "+ new InstanceCounter().instanceCounter);
//    }
    {
        instanceCounter++;
        System.out.println("instanceCounter=" + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("Starting InstanceCounter");
        
        new InstanceCounter(); // annonymous object
        new InstanceCounter();
        new InstanceCounter();
        System.out.println("instanceCounter in main=" + instanceCounter);
//        System.out.println("instanceCounter in main=" + new InstanceCounter().instanceCounter);
    }
    static{
        System.out.println("Class InstanceCounter loaded");
    }
    
}
