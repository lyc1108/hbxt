package bean;

public class Fligth {
    private  String id;
    private  String planeType;//飞机型号
    private  String departureAirPort;//出发地
    private  String destinationAirPore;//目的地
    private  String departureTime;//出发日期

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPore() {
        return destinationAirPore;
    }

    public void setDestinationAirPore(String destinationAirPore) {
        this.destinationAirPore = destinationAirPore;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }


}
