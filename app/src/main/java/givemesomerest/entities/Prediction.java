package givemesomerest.entities;

import com.google.common.base.Objects;

public class Prediction {

    private String weather;
    private double temperature;
    private boolean shouldUserUmbrella;

    public Prediction(String weather, double temperature, boolean shouldUserUmbrella) {
        this.weather = weather;
        this.temperature = temperature;
        this.shouldUserUmbrella = shouldUserUmbrella;
    }

    // argumentless constructor --> important later for serialization
    public Prediction() {

    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isShouldUserUmbrella() {
        return shouldUserUmbrella;
    }

    public void setShouldUserUmbrella(boolean shouldUserUmbrella) {
        this.shouldUserUmbrella = shouldUserUmbrella;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prediction that = (Prediction) o;
        return Double.compare(that.temperature, temperature) == 0 && shouldUserUmbrella == that.shouldUserUmbrella && Objects.equal(weather, that.weather);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weather, temperature, shouldUserUmbrella);
    }

    @Override
    public String toString() {
        return "Prediction{" +
                "weather='" + weather + '\'' +
                ", temperature=" + temperature +
                ", shouldUserUmbrella=" + shouldUserUmbrella +
                '}';
    }
}
