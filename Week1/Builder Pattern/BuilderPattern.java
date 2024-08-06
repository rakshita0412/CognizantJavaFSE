import java.util.Objects;

class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String GPU;

    private Computer(Builder builder) {
        this.CPU = Objects.requireNonNull(builder.CPU, "CPU must not be null");
        this.RAM = Objects.requireNonNull(builder.RAM, "RAM must not be null");
        this.storage = Objects.requireNonNull(builder.storage, "Storage must not be null");
        this.GPU = builder.GPU != null ? builder.GPU : "Integrated Graphics";     }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;
        private final String storage;
        private String GPU;

        // Constructor for required attributes
        public Builder(String CPU, String RAM, String storage) {
            this.CPU = Objects.requireNonNull(CPU, "CPU must not be null");
            this.RAM = Objects.requireNonNull(RAM, "RAM must not be null");
            this.storage = Objects.requireNonNull(storage, "Storage must not be null");
        }

        // Method to set the optional GPU attribute
        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        // Build method to create the Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        // Creating a Gaming PC with an optional GPU
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .build();

        // Creating an Office PC without specifying a GPU
        Computer officePC = new Computer.Builder("Intel i5", "16GB", "512GB SSD")
                .build();

        // Displaying configurations
        System.out.println("Gaming PC Configuration:");
        System.out.println("CPU: " + gamingPC.getCPU());
        System.out.println("RAM: " + gamingPC.getRAM());
        System.out.println("Storage: " + gamingPC.getStorage());
        System.out.println("GPU: " + gamingPC.getGPU()); // Shows the specified GPU

        System.out.println("\nOffice PC Configuration:");
        System.out.println("CPU: " + officePC.getCPU());
        System.out.println("RAM: " + officePC.getRAM());
        System.out.println("Storage: " + officePC.getStorage());
        System.out.println("GPU: " + officePC.getGPU()); // Shows default GPU value: "Integrated Graphics"
    }
}
