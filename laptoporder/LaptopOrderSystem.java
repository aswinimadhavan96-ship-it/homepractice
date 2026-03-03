package laptoporder;

import java.util.Scanner;

public class LaptopOrderSystem {
        static class Laptop {
          private final String brand;
          private final String ram;
          private final boolean ssd;
          private final boolean graphicsCard;
          private final boolean extendedWarranty;
          private final boolean msOffice;

       private Laptop(LaptopBuilder builder) {
            this.brand = builder.brand;
            this.ram = builder.ram;
            this.ssd = builder.ssd;
            this.graphicsCard = builder.graphicsCard;
            this.extendedWarranty = builder.extendedWarranty;
            this.msOffice = builder.msOffice;
        }

        public static class LaptopBuilder {
            private final String brand;
            private final String ram;
            private boolean ssd = false;
            private boolean graphicsCard = false;
            private boolean extendedWarranty = false;
            private boolean msOffice = false;

            public LaptopBuilder(String brand, String ram) {
                this.brand = brand;
                this.ram = ram;
            }

            public LaptopBuilder setSSD(boolean ssd) {
                this.ssd = ssd;
                return this;
            }

            public LaptopBuilder setGraphicsCard(boolean graphicsCard) {
                this.graphicsCard = graphicsCard;
                return this;
            }

            public LaptopBuilder setExtendedWarranty(boolean extendedWarranty) {
                this.extendedWarranty = extendedWarranty;
                return this;
            }

            public LaptopBuilder setMSOffice(boolean msOffice) {
                this.msOffice = msOffice;
                return this;
            }

             public Laptop build() {
                return new Laptop(this);
            }
        }

         public void displayDetails() {
            System.out.println("------ Laptop Order Details ------");
            System.out.println("Brand: " + brand);
            System.out.println("RAM: " + ram);
            System.out.println("SSD: " + ssd);
            System.out.println("Graphics Card: " + graphicsCard);
            System.out.println("Extended Warranty: " + extendedWarranty);
            System.out.println("MS Office: " + msOffice);
        }
    }

}
    