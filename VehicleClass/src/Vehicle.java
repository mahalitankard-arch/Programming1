import java.time.LocalDate;
public class Vehicle {
	
	private String vin;
	private String make;
	private String model;
	private int year;
	private String color;
	private int mileage;
	private double price;
	private char transmission;
	private String trim;
	private char fuelType;
	private Boolean usedStatus;
	private int previousOwners;
	private int onlineViews;
	private java.time.LocalDate acquisitionDate;
	 
	//Default Constructor
	public Vehicle() {
	this.vin= "";
	this.make = "";
	this.model = "";
	this.year =0;
	this.color= "";
	this.mileage= 0;
	this.price= 0.00;
	this.transmission= 'U';
	this.trim= "";
	this.fuelType= 'U';
	this.usedStatus= false;
	this.previousOwners= 0;
	this.onlineViews= 0;
	this.acquisitionDate= null;
	}
	// Parameterized Constructor
	public Vehicle(String vin, String make, String model, int year, String color, int mileage, double price, char transmission, String trim, char fuelType, Boolean usedStatus, int previousOwners, int onlineViews, java.time.LocalDate acquisitionDate) {
	this.vin=vin;
	this.make = make;
	this.model = model;
	this.year = year;
	this.color= color;
	this.mileage= mileage;
	this.price= price;
	this.transmission= transmission;
	this.trim= trim;
	this.fuelType= fuelType;
	this.usedStatus= usedStatus;
	this.previousOwners= previousOwners;
	this.onlineViews= onlineViews;
	this.acquisitionDate= acquisitionDate;
	}


	    // Getters and Setters
	    public String getVin() { return vin; }
	    public void setVin(String vin) { this.vin = vin; }

	    public String getMake() { return make; }
	    public void setMake(String make) { this.make = make; }

	    public String getModel() { return model; }
	    public void setModel(String model) { this.model = model; }

	    public int getYear() { return year; }
	    public void setYear(int year) { this.year = year; }

	    public String getColor() { return color; }
	    public void setColor(String color) { this.color = color; }

	    public int getMileage() { return mileage; }
	    public void setMileage(int mileage) { this.mileage = mileage; }

	    public double getPrice() { return price; }
	    public void setPrice(double price) { this.price = price; }

	    public char getTransmission() { return transmission; }
	    public void setTransmission(char transmission) { this.transmission = transmission; }

	    public String getTrim() { return trim; }
	    public void setTrim(String trim) { this.trim = trim; }

	    public char getFuelType() { return fuelType; }
	    public void setFuelType(char fuelType) { this.fuelType = fuelType; }

	    public Boolean getUsedStatus() { return usedStatus; }
	    public void setUsedStatus(Boolean usedStatus) { this.usedStatus = usedStatus; }

	    public int getPreviousOwners() { return previousOwners; }
	    public void setPreviousOwners(int previousOwners) { this.previousOwners = previousOwners; }

	    public int getOnlineViews() { return onlineViews; }
	    public void setOnlineViews(int onlineViews) { this.onlineViews = onlineViews; }

	    public LocalDate getAcquisitionDate() { return acquisitionDate; }
	    public void setAcquisitionDate(LocalDate acquisitionDate) { this.acquisitionDate=acquisitionDate;}
	// List Vehicle information

	    public String[] listVehicleInformation() {
	        String[] Attribute = new String[14];
	        Attribute[0] = "VIN: " + vin;
	        Attribute[1] = "Make: " + make;
	        Attribute[2] = "Model: " + model;
	        Attribute[3] = "Year: " + year;
	        Attribute[4] = "Color: " + color;
	        Attribute[5] = "Mileage: " + mileage;
	        Attribute[6] = "Price: " + price;
	        Attribute[7] = "Transmission: " + transmission;
	        Attribute[8] = "Trim: " + trim;
	        Attribute[9] = "Fuel Type: " + fuelType;
	        Attribute[10] = "Used Status: " + usedStatus;
	        Attribute[11] = "Previous Owners: " + previousOwners;
	        Attribute[12] = "Online Views: " + onlineViews;
	        Attribute[13] = "Acquisition Date: " + acquisitionDate;
	        return Attribute;
	    }
	}