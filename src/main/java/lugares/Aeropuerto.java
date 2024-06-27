package lugares;

import viajes.Viaje;
import viajes.Vuelo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Aeropuerto {
  private Ciudad ciudad;
  private List<Vuelo> vuelos;
  private String nombre;

  public Aeropuerto(Ciudad ciudad, List<Vuelo> vuelos, String nombre) {
    this.ciudad = ciudad;
    this.vuelos = vuelos;
    this.nombre = nombre;
  }

  public void agregarVuelos(Vuelo v){
    vuelos.add(v);
  }
  public long cantVuelosQuePartieronEnElDia(LocalDateTime dia) {
    LocalDate fecha = dia.toLocalDate();
    return this.vuelos
        .stream()
        .filter(v -> v.getFechaVuelo().toLocalDate().isEqual(fecha))
        .count();
  }

  public long cantVuelosQueLLegaronEnElDia(LocalDateTime dia) {
    LocalDate fecha = dia.toLocalDate();
    return this.vuelos
        .stream()
        .filter(v -> v.fechaDeLlegada().toLocalDate().isEqual(fecha))
        .count();
  }

}
