package cn.edu.hcnu.dao;
import cn.edu.hcnu.bean.Flight;
import java.util.Set;

public interface IFlightDao {
    void insertFlights(Flight flight);
    Set<Flight>getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirPort);
    Flight getFlightByDestinationAirport(String destinationAirPort);
    void updateFlight(Flight flight);

}
