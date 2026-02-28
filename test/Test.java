package test;
public class Test {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder("Intel i7", "16GB")
                .setHDD("1TB")
                .setGraphics("NVIDIA RTX 4060")
                .build();

        System.out.println("CPU: " + computer.getCPU());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("HDD: " + computer.getHDD());
        System.out.println("Graphics: " + computer.getGraphics());
    }
}