package BUILDER;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;


    public void setCPU(String CPU) {
        this.CPU = CPU;
    }



    public void setGPU(String GPU) {
        this.GPU = GPU;
    }



    public void setRAM(int RAM) {
        this.RAM = RAM;
    }



    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                '}';
    }
}
