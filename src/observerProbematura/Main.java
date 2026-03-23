package observerProbematura;

public class Main {
 public static void main(String[] args) {
     WeatherStation station = new WeatherStation();

     Observer app = new MobileApp("Handy-App");
     Observer dashboard = new WebDashboard("Schul-Dashboard");

     station.addObserver(app);
     station.addObserver(dashboard);

     station.setMeasurements(23.5f, 61.0f);
 }
}
