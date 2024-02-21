package entities;

public class OutsourcedEmployee extends Employee { // para colocar como subclasse

	private Double additionalCharge;

	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour); // para puxar a superclasse e repassar a informação da sub
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() { // pagamento do empregado tercerizado
		return super.payment() + additionalCharge * 1.1; //  additionalCharge representa a adição
	}
}
