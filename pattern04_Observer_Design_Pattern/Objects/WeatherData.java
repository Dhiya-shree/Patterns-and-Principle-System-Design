package src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects;

public class WeatherData extends ObjectData{
    private int temperature;
    private int humidity;
    private int windFlow;

    public WeatherData() {
        super("Weather Object");
    }
    public WeatherData(int t,int h,int w) {
        super("Weather Object");
        this.temperature=t;
        this.humidity=h;
        this.windFlow=w;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getWindFlow() {
        return windFlow;
    }

    public void setWindFlow(int windFlow) {
        this.windFlow = windFlow;
    }

    public String toString() {
        return ("Temperature:"+temperature+"\n WindFlow:"+windFlow+" \n humidity:"+humidity);
    }
}
