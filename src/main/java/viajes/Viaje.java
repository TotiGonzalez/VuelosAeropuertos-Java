package viajes;

import java.util.List;

public class Viaje {
  private List<Vuelo> viajes;
  private List<Escala> escalas;
  private Aerolinea aerolinea;

  public Viaje(List<Vuelo> viajes, List<Escala> escalas) {
    this.viajes = viajes;
    this.escalas = escalas;
  }

  public Integer pasajerosTotales(){
    return this.viajes.stream().mapToInt(Vuelo::cantPasajeros).sum();
  }

  public Double DuracionVuelos(){
    return this.viajes.stream().mapToDouble(Vuelo::getDuracionVuelo).sum();
  }
  public Double DuracionEscalas(){
    return this.escalas.stream().mapToDouble(Escala :: getDuracionEscala).sum();
  }
  public Double DuracionViaje(){
    return this.DuracionVuelos() + this.DuracionEscalas();
  }
}
