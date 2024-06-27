package viajes;

import lugares.Aeropuerto;
import personas.Pasajero;
import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {
  private Aeropuerto aeropuertoSalida;
  private Aeropuerto aeropuertoLlegada;
  private Double duracionVuelo;
  private LocalDateTime fechaVuelo;
  private Avion avion;
  private int cantAsientosOfrecidos;
  private List<Pasajero> pasajeros;

  public Vuelo(List<Pasajero> pasajeros) {
    this.pasajeros = pasajeros;
  }

  public Aeropuerto getAeropuertoSalida() {
    return aeropuertoSalida;
  }

  public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
    this.aeropuertoSalida = aeropuertoSalida;
  }

  public Aeropuerto getAeropuertoLlegada() {
    return aeropuertoLlegada;
  }

  public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
    this.aeropuertoLlegada = aeropuertoLlegada;
  }

  public Double getDuracionVuelo() {
    return duracionVuelo;
  }

  public void setDuracionVuelo(Double duracionVuelo) {
    this.duracionVuelo = duracionVuelo;
  }

  public LocalDateTime getFechaVuelo() {
    return fechaVuelo;
  }

  public void setFechaVuelo(LocalDateTime fechaVuelo) {
    this.fechaVuelo = fechaVuelo;
  }

  public Avion getAvion() {
    return avion;
  }

  public void setAvion(Avion avion) {
    this.avion = avion;
  }

  public int getCantAsientosOfrecidos() {
    return cantAsientosOfrecidos;
  }

  public void setCantAsientosOfrecidos(int cantAsientosOfrecidos) {
    this.cantAsientosOfrecidos = cantAsientosOfrecidos;
  }

  public List<Pasajero> getPasajeros() {
    return pasajeros;
  }

  public void setPasajeros(List<Pasajero> pasajeros) {
    this.pasajeros = pasajeros;
  }

  public Integer cantAsientosOcupados(){
    return (this.cantPasajeros() * 100) / cantAsientosOfrecidos;
  }

  public Integer cantPasajeros() {
    return pasajeros.size();
  }

  public LocalDateTime fechaDeLlegada() {
    return this.fechaVuelo.plusMinutes(this.duracionVuelo.longValue());
  }
}
