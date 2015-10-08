package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends Natu {
	private int value;

	private static final String[] textValue = { "cero", "uno", "dos", "tres", "cuatro", "cinco" };

	public NaturalNumberEs(int value) {
		this.setValue(value);
	}


	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public String getTextValue() {
		if (this.value < textValue.length) {
			return NaturalNumberEs.textValue[this.value];
		} else {
			return "???";
		}
	}

}
