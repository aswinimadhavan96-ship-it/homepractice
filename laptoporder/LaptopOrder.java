package laptoporder;

import java.util.Scanner;

public class LaptopOrder{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand (Dell/HP/Lenovo): ");
        String brand = sc.nextLine();

        System.out.print("Enter RAM (8GB/16GB/32GB): ");
        String ram = sc.nextLine();

        System.out.print("Add SSD? true/false: ");
        boolean ssd = sc.nextBoolean();

        System.out.print("Add Graphics Card? true/false: ");
        boolean graphicsCard = sc.nextBoolean();

        System.out.print("Add Extended Warranty? true/false: ");
        boolean extendedWarranty = sc.nextBoolean();

        System.out.print("Add MS Office? true/false: ");
        boolean msOffice = sc.nextBoolean();

        // Create Laptop using Builder
        Laptop laptop = new Laptop.LaptopBuilder(brand, ram)
                .setSSD(ssd)
                .setGraphicsCard(graphicsCard)
                .setExtendedWarranty(extendedWarranty)
                .setMSOffice(msOffice)
                .build();

        laptop.displayDetails();

        sc.close();
    }
}