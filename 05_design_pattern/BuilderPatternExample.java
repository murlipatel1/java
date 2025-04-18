// Product
class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    // Private constructor, we only allow creation via the builder
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + ", GPU=" + GPU + "]";
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
            .setCPU("Intel i7")
            .setRAM("16GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA RTX 3080")
            .build();

        System.out.println(computer);
    }
}
