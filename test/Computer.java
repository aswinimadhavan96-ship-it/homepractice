package test;

public class Computer {
    private final String CPU;
    private final String RAM;
    private final String HDD;
    private final String Graphics;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.Graphics = builder.Graphics;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getGraphics() {
        return Graphics;
    }

        public static class Builder {

       private final String CPU;
        private final String RAM;

         private String HDD;
        private String Graphics;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder setGraphics(String Graphics) {
            this.Graphics = Graphics;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}    

