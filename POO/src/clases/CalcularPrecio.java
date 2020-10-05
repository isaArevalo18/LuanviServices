package clases;

import modelo.Cliente;
import modelo.Lecturas;
import ventanas.FrmCreacionUsuario;

public class CalcularPrecio {

    String Total;
    String RESTA;

    public void calcularConsumo(String numeroMed) {
        double subTotal;
        int lecActual;
        int lecAnterior;
        double resta;

//        double Total_pru;
//
//        Cliente cli = new Cliente();
       
        double restaExeso;
        double multiplicacionEx;
       
        double multiplSinExeso;
//*******************************Calcular Precio ******************
//        for (Cliente c : FrmCreacionUsuario.ListaCliente) {
//            if (c.getNum_medidor().equals(numeroMed)) {
//
//                for (Lecturas L : listaLectura) {
//                    for (int i = listaLectura.size(); i <= listaLectura.size(); i--) {
//                        if (L.getNumMedidor().equals(numeroMed)) {
//
//                            lecActual = Integer.parseInt(L.getLectura());
//                            lecAnterior = Integer.parseInt(L.getLecturaAnter());
//                            resta = lecActual - lecAnterior;
//                            if (resta == 0) {
//                                subTotal = 2.50;
//
//                            } else {
//                                if (resta > 10 && resta <= 20) {
//                                    restaExeso = resta - 10;
//                                    multiplicacionEx = restaExeso * 1.00;
//                                    multiplSinExeso = 10 * 0.25;
//                                    subTotal = multiplicacionEx + multiplSinExeso;
//
//                                } else {
//                                    if (resta > 20) {
//                                        restaExeso = resta - 20;
//                                       multiplicacionEx= restaExeso * 5.00;
//                                        subTotal = multiplicacionEx + 2.50 + 10;
//                                    } else {
//                                        subTotal = 2.50;
//                                    }
//
//                                }
//                            }
//                            Total = String.format("%.2f", subTotal);
//
//                            break;
//                        }
//                        break;
//                    }
//
//                }
//
//            }
//        }

    }

    public void calcularM3(String lecAct, String lecAnter) {
        int LECTURAANT;
        int LECTURAACT;
        int total;
        LECTURAACT = Integer.parseInt(lecAct);
        LECTURAANT = Integer.parseInt(lecAnter);
        total = LECTURAACT - LECTURAANT;
        RESTA = Integer.toString(total);
    }

    public String getTotal() {
        return Total;
    }

    public String getConsumo() {
        return RESTA;
    }

}
