package com.manufacturer;

public class Manufacturer {

	private String manufacturerName;
	private String manufacturerAddress;
	private String registerationNumber;
	
	private Manufacturer(String manufacturerName, String manufacturerAddress, String registerationNumber) {
		
		this.manufacturerName = manufacturerName;
		this.manufacturerAddress = manufacturerAddress;
		this.setRegisterationNumber(registerationNumber);;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		
			this.manufacturerName = manufacturerName;
		
	}

	public String getManufacturerAddress() {
		return manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		
			this.manufacturerAddress = manufacturerAddress;
		
	}

	public String getRegisterationNumber() {
		return registerationNumber;
	}

public void setRegisterationNumber(String registerationNumber) {
		
		if(registerationNumber.length()!=10 || registerationNumber.length()==0){
			this.registerationNumber=null;
		}
		else {
			this.registerationNumber = registerationNumber;

		}	
	}

	public String toString() {
		return "Manufacturer [manufacturerName=" + manufacturerName + ", manufacturerAddress=" + manufacturerAddress
				+ ", registerationNumber=" + registerationNumber + "]";
	}
	
	public static Manufacturer getManufacturerObject(String manufacturerName,String manufacturerAddress,String registerationNumber) {
		if(manufacturerName==null||manufacturerName.isEmpty()||manufacturerAddress==null||manufacturerAddress.isEmpty()||registerationNumber==null||registerationNumber.isEmpty()) {
			return null;
		}
		else {
			return new Manufacturer(manufacturerName,manufacturerAddress,registerationNumber);
		}	
	}
	
	
	
}
