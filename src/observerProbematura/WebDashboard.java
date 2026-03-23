package observerProbematura;

class WebDashboard implements Observer {
	private String name;
	
	public WebDashboard(String name) {
		this.name = name;
	}

	@Override
	public void update(float temperature, float humidity) {
		 System.out.println("WebDashboard " + name +
	                ": Temperatur = " + temperature +
	                "°C, Luftfeuchtigkeit = " + humidity + "%");	
	}
}
