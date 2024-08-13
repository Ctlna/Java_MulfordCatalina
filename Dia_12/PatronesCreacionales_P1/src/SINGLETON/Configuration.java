package SINGLETON;

public class Configuration {
    private static Configuration instance;
    private String configValue;

    private Configuration(){
        configValue = "Valor por Default";
    }

    public static synchronized Configuration getInstance(){
        if(instance == null){
            instance = new Configuration();
        }
        return  instance;
    }

    public void setConfigValue(String configValue){
        this.configValue = configValue;
    }

    public String getConfigValue() {
        return configValue;
    }
}
