package personas;

import viajes.Vuelo;
import java.util.List;

public class Pasajero extends Persona {
  private List<Vuelo> viajesRealizados;

  public Pasajero(List<Vuelo> viajesRealizados) {
    this.viajesRealizados = viajesRealizados;
  }

  public void agregarVuelo(Vuelo v) {
    viajesRealizados.add(v);
  }
  public Integer cantVuelosRealizados(){
    return this.viajesRealizados.size();
  }

}
