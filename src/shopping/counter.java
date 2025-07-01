package shopping;

public class counter {
	public static void main(String[] args) {
		shop s = new shop();
		Customer c = new Customer();
		int television = s.televisionR * c.televisionQuantity;
		int chargingCable = s.chargingCableR * c.chargingCableQuantity;
		int mobailPhone = s.mobailPhoneR * c.mobailPhoneQuantity;
		int airConditioner =s.airConditionerR * c.airCanditionersQuantity;
		int adapter = s.adapterR * c.adapterQuantity;
		int laptop = s.laptopR * c.laptopQuantity;
		int total= television+ chargingCable + mobailPhone + airConditioner + adapter + laptop;
		System.out.println("product      "+"Quantity   "+"unit Price  "+" total price  ");
		System.out.println("telvision      "+c.televisionQuantity+"         "+s.televisionR+"       "+television);
		System.out.println("chargingCable  "+c.chargingCableQuantity+"         "+s.chargingCableR+"       "+chargingCable);
		System.out.println("mobailPhone      "+c.mobailPhoneQuantity+"       "+s.mobailPhoneR+"      "+mobailPhone);
		System.out.println("airConditioner  "+c.airCanditionersQuantity+"       "+s.airConditionerR+"    "+airConditioner);
		System.out.println("adapter        "+c.adapterQuantity+"       "+s.adapterR+"     "+adapter);
		System.out.println("laptop        "+c.laptopQuantity+"       "+s.laptopR +"     "+laptop);
		System.out.println("total bill is ="+total);
	}

}
