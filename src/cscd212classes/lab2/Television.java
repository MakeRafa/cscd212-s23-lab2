package cscd212classes.lab2;

public class Television {
//    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(String make, String model, int resolution, int screenSize, boolean smart) throws IllegalAccessException {
        this(model, smart, screenSize, resolution, make);
        if (make == null || make.isEmpty() || model == null || model.isEmpty() || screenSize < 32 || resolution < 720) {
            throw new IllegalAccessException("Test 1");
        }
    }

    public Television(String model, boolean smart, int screenSize, int resolution, String make) {
        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.make = make;
    }
    public int getScreenSize(){
        return this.screenSize;
    }
    public int getResolution(){
        return this.resolution;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }


}
