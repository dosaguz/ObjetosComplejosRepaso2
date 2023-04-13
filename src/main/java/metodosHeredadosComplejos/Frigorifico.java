package metodosHeredadosComplejos;

public class Frigorifico extends Electrodomestico implements Cloneable {

    private int temperatura;

    public Frigorifico(String marca, String modelo, int watios, int temperatura) {
        super(marca, modelo, watios);
        this.temperatura = temperatura;
    }

   // public Frigorifico(Frigorifico otro) {
     //   this.temperatura = otro.temperatura;
    //}

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Frigorifico [marca=" + getMarca() + ", modelo=" + getModelo() + ", watios=" + getWatios() + ", temperatura=" + temperatura + "]";
    }

    @Override
    public boolean equals(Object obj) {
    	Frigorifico e = (Frigorifico) obj;
		return(this.temperatura==e.temperatura && this.marca==e.marca && this.modelo == e.modelo && this.watios== e.watios);
    }

    @Override
    public Frigorifico clone() {
		Frigorifico e = new Frigorifico(this.marca,this.modelo,this.watios, this.temperatura);
		return e;
    }
}