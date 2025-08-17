package builderPatternExample;

public class Computer {
	private final String CPU;
	private final String RAM;
	private final String HDD;
	
	private String graphicsCard;
	private String bluetooth;

    private Computer(String CPU, String HDD, String RAM, String graphicsCard, String bluetooth) {
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU +", HDD=" + HDD + ", RAM=" + RAM +", GraphicsCardEnabled=" + graphicsCard + ", BluetoothEnabled=" + bluetooth + "]";
    }
    
    public static class Builder {
    	private final String CPU;
        private final String HDD;
        private final String RAM;

        private String graphicsCard;
        private String bluetooth;

        public Builder(String CPU, String HDD, String RAM) {
        	this.CPU = CPU;
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public Builder enableGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder enableBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(CPU, HDD, RAM, graphicsCard, bluetooth);
        }
    }
}
