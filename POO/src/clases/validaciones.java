package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JTextField;

public class validaciones {

    String ce;

    // validacion de datos de clientes --------------------------------------------
    public static boolean validarCedula(String cedula) {
        boolean validar = false;
        int digito = 0, suma = 0, acumulador, resta = 0, ultimoDigito = 0;

        validar = cedula.matches("[0-9]{10}");

        if (validar == true) {

            ultimoDigito = Integer.parseInt(cedula.charAt(9) + "");

            for (int i = 0; i < cedula.length() - 1; i++) {
                digito = Integer.parseInt(cedula.charAt(i) + "");
                if (i % 2 == 0) {
                    digito = digito * 2;

                    if (digito > 9) {

                        digito = digito - 9;
                    }
                }

                suma = suma + digito;
            }

            if (suma % 10 != 0) {
                acumulador = ((suma / 10) + 1) * 10;
                resta = acumulador - suma;
            }

            if (ultimoDigito == resta) {
                validar = true;
            } else {
                validar = false;
            }

        } else {
            validar = false;
        }

        return validar;
    }
    Character s;

    public static boolean validarCorreo(String correo) {
        boolean validar = false;
        validar = correo.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@"
                + "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$");
        return validar;
    }

    public void soloLentrasEspacios(KeyEvent evt) {
        s = evt.getKeyChar();
        if (!Character.isLetter(s) && s != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }

    public void ValidarLetras(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    public void ValidarNumeros(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    public void LimitarCaracteres(JTextField campo, int cant) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                int tamaño = campo.getText().length();
                if (tamaño >= cant) {
                    e.consume();
                }
            }
        });
    }

    public static boolean validarFechaLectura(String fechaanterior, String fechaactual) {
        if (fechaanterior.equals("")) {
            return true;
        } else {
            String[] fechArrayAnterior = fechaanterior.split("-");
            int mesAnterior = Integer.valueOf(fechArrayAnterior[1]);

            String[] fechArrayActual = fechaactual.split("-");
            int mesActual = Integer.valueOf(fechArrayActual[1]);
            
            if (mesAnterior == mesActual) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static boolean validarEditarFechaLectura(String fechaingresada, String fechaactual) {
        String[] fechArrayAnterior = fechaingresada.split("-");
        int mesingresado = Integer.valueOf(fechArrayAnterior[1]);

        String[] fechArrayActual = fechaactual.split("-");
        int mesActual = Integer.valueOf(fechArrayActual[1]);
        
        if (mesingresado == mesActual) {
            return true;
        } else {
            return false;
        }
    }
}
