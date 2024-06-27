package viajes;

import lugares.Aeropuerto;

public class Escala {
  private Aeropuerto aeropuerto;
  private Double duracionEscala;

  public Aeropuerto getAeropuerto() {
    return aeropuerto;
  }

  public void setAeropuerto(Aeropuerto aeropuerto) {
    this.aeropuerto = aeropuerto;
  }

  public Double getDuracionEscala() {
    return duracionEscala;
  }

  public void setDuracionEscala(Double duracionEscala) {
    this.duracionEscala = duracionEscala;
  }
}
