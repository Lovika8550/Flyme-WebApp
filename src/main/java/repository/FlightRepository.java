package repository;

import model.CountryDTO;
import model.Flight;
import model.FlightSearchDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface FlightRepository {

    Optional<Flight> find(Long id);

    List<Flight> findAll();

    Map<String, Flight> findAllWithSearchCriteria(FlightSearchDTO flightSearch, LocalDate travelDate);


    List<Flight> findAllByCountry(CountryDTO countryDTO);
}
