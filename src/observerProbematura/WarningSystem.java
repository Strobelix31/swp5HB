package observerProbematura;

class WarningSystem implements Observer{

	 private float threshold;

	    public WarningSystem(float threshold) {
	        this.threshold = threshold;
	    }

	    @Override
	    public void update(float temperature, float humidity) {
	        if (temperature > threshold) {
	            System.out.println("Warnsystem: Achtung! Temperatur über " + threshold + "°C");
	        } else {
	            System.out.println("Warnsystem: Keine Warnung.");
	        }
	    }
	}
