/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroCarlos;

import static CajeroCarlos.CajerooUI.pantallaPrincipal;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author InfaSysKey Carlos del Cura Pascual
 * @version 1.0
 *
 */
public class ServicioBBDD {

    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rst;

    /**
     * Conexion a la base de datos.
     *
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancacajero?autoReconnect=true&useSSL=false", "root", "admin");
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar con la base de datos " + e.toString());
        }
    }

    /**
     *
     * @return Devuleve la lista de usuarios de la base de datos, en forma de un
     * arraylist.
     *
     */
    public static List<Usuario> getUsuarios() {
        List usuarios = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.USUARIOS");
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellido(rs.getString(3));
                System.out.println("Nombre: " + rs.getString(2) + " Apellido : " + rs.getString(3)
                        + " idUsuario: " + rs.getInt(1));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar usuarios " + ex.toString());
        }
        return usuarios;
    }

    /**
     *
     * @param idUsuario el usuario que queremos coger los datos.
     * @return devuleve el usuario en concreto que le pedimos atraves del
     * parametro.
     */
    public static Usuario getUsuario(int idUsuario) {
        Usuario usuario = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.USUARIOS WHERE ID_USUARIO = " + idUsuario);
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellido(rs.getString(3));
                System.out.println("Nombre: " + rs.getString(2) + " Apellido : " + rs.getString(3)
                        + " idUsuario: " + rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar usuario " + ex.toString());
        }
        return usuario;
    }

    /**
     *
     * @param idCuenta la cuenta que queremos coger los datos.
     * @return devuleve la cuenta en concreto que le pedimos ataves del
     * parametro.
     */
    public static Cuenta getCuenta(int idCuenta) {
        Cuenta cuenta = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.CUENTAS WHERE ID_CUENTA = " + idCuenta);
            //Recorremos el resultset. SIEMPRE se hace igual.
            while (rs.next()) {
                cuenta = new Cuenta();
                cuenta.setIdCuenta(rs.getInt(1));
                cuenta.setIdUsuario(rs.getInt(2));
                cuenta.setSaldo(rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar cuenta " + ex.toString());
        }
        return cuenta;
    }

    /**
     *
     * @param idTarjeta la tarjeta que quremos coger los datos.
     * @return devuelve todos los datos de la tarjeta
     */
    public static Tarjeta getTarjeta(int idTarjeta) {
        Tarjeta tarjeta = new Tarjeta();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.TARJETAS WHERE ID_TARJETA = " + idTarjeta);
            //Recorremos el resultset. SIEMPRE se hace igual.
            while (rs.next()) {
                tarjeta = new Tarjeta();
                tarjeta.setIdTarjeta(rs.getInt(1));
                tarjeta.setIdCuenta(rs.getInt(2));
                tarjeta.setPin(rs.getInt(3));
                tarjeta.setTarjeta_bloqueo(rs.getInt(4));
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar tarjeta " + ex.toString());
        }
        return tarjeta;
    }

    /**
     *
     * @param idCuenta los movimeinto del usuario que le pasamos
     * @return devuelve todos lo datos de los movimientos de esa cuenta.
     */
    public static List<Movimiento> getMovimientos(int idCuenta) {
        List<Movimiento> listaMovimientos = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.MOVIMIENTOS WHERE ID_CUENTA = " + idCuenta);
            //Recorremos el resultset. SIEMPRE se hace igual.
            while (rs.next()) {
                Movimiento movimiento = new Movimiento();
                movimiento.setIdMovimiento(rs.getInt(1));
                movimiento.setIdCuenta(idCuenta);
                movimiento.setCantidad(rs.getInt(3));
                movimiento.setConcepto(rs.getString(4));
                movimiento.setFecha(rs.getDate(5));
                listaMovimientos.add(movimiento);
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar usuarios " + ex.toString());
        }
        return listaMovimientos;
    }

    /**
     *
     * @param idCuenta le pasamos la cuenta que queremos saber los datos de las
     * tarjetas
     * @return devolvemos los datos en concreto de esa cuenta.
     */
    public static List<Tarjeta> getTarjetasLista(int idCuenta) {
        List<Tarjeta> listaTarjeta = new ArrayList();
        try {

            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.TARJETAS WHERE ID_CUENTA = " + idCuenta);
            //Recorremos el resultset. SIEMPRE se hace igual.
            while (rs.next()) {
                Tarjeta tarjeta = new Tarjeta();
                tarjeta.setIdTarjeta(rs.getInt(1));
                tarjeta.setIdCuenta(rs.getInt(2));
                tarjeta.setPin(rs.getInt(3));
                tarjeta.setTarjeta_bloqueo(rs.getInt(4));
                listaTarjeta.add(tarjeta);
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar tarjeta " + ex.toString());
        }
        return listaTarjeta;
    }

    /**
     *
     * @param cuenta le pasamos toda la cuenta para la accion de raterira dinero
     * del cajero.
     */
    public static void actualizaSaldoRetirar(Cuenta cuenta) {
        try {
            String sentSql = "UPDATE bancacajero.CUENTAS SET SALDO = "
                    + cuenta.getSaldo() + " WHERE ID_CUENTA = " + cuenta.getIdUsuario();
            System.out.println(sentSql);
            int saldo = stmt.executeUpdate(sentSql);
            if (saldo > 0) {
                JOptionPane.showMessageDialog(pantallaPrincipal, "Por favor retire su dinero", "Operacion Retirar", JOptionPane.OK_OPTION);
            }
        } catch (SQLException e) {
            System.out.println("Error al cambiar el saldo " + e.toString());
        }
    }

    /**
     *
     * @param cuenta le pasamos toda la cuenta para la accion de ingresar dinero
     * en la cuenta.
     */
    public static void actualizaSaldoIngresa(Cuenta cuenta) {
        try {
            String sentSql = "UPDATE bancacajero.CUENTAS SET SALDO = "
                    + cuenta.getSaldo() + " WHERE ID_CUENTA = " + cuenta.getIdUsuario();
            System.out.println(sentSql);
            int saldo = stmt.executeUpdate(sentSql);
            if (saldo > 0) {
                JOptionPane.showMessageDialog(pantallaPrincipal, "Ingreso correcto", "Operacion Ingresar", JOptionPane.OK_OPTION);
            }
        } catch (SQLException e) {
            System.out.println("Error al cambiar el saldo " + e.toString());
        }
    }

    /**
     *
     * @param idTarjeta la tarjeta sobre la que quermos hacer el cambio.
     * @param numPin el pin nuevo que le vamos a cambiar a la tarjeta.
     */
    public static void actualizarPin(int idTarjeta, int numPin) {
        try {
            String sentSql = "UPDATE bancacajero.TARJETAS SET PIN = "
                    + numPin + " WHERE ID_TARJETA = " + idTarjeta;
            System.out.println(sentSql);
            stmt.executeUpdate(sentSql);
            JOptionPane.showMessageDialog(pantallaPrincipal, "Cambio de pin correcto", "Operacion Cambio Pin", JOptionPane.OK_OPTION);
        } catch (SQLException e) {
            System.out.println("Error al actualizar el pin " + e.toString());
        }
    }

    /**
     *
     * @param cuenta toda la cuenta sobre la qeu trabajar
     * @param cantidad la cantidad que se ha hecho en la accion de reitirar y
     * introducir dinero.
     * @param tarjeta la tarjeta sobre la que ha diso afectada este movimiento.
     */
    public static void insertaMovimientoIngreso(Cuenta cuenta, int cantidad, Tarjeta tarjeta) {
        String concepto = "Reintegro";
        if (cantidad > 0) {
            concepto = "Ingreso";
        }
        Date fec = new Date();
        SimpleDateFormat dNow = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = dNow.format(fec);
        String sentSQL = "INSERT into bancacajero.movimientos values(NULL,'"
                + cuenta.getIdUsuario() + "',"
                + cantidad + ",'"
                + concepto + "','"
                + fecha + "')";
        System.out.println(sentSQL);
        try {
            stmt.executeUpdate(sentSQL);
        } catch (SQLException e) {
            System.out.println("Error al insertar el movimiento de ingreso " + e.toString());
        }
    }

    /**
     *
     * @param cuenta toda la cuenta sobre la qeu trabajar
     * @param cantidad la cantidad que se ha hecho en la accion de reitirar y
     * introducir dinero.
     * @param tarjeta la tarjeta sobre la que ha diso afectada este movimiento.
     */
    public static void insertaMovimientoRetirada(Cuenta cuenta, int cantidad, Tarjeta tarjeta) {

        String concepto = "Reintegro";
        if (cantidad > 0) {
            concepto = "Retirada";
        }
        Date fec = new Date();
        SimpleDateFormat dNow = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = dNow.format(fec);
        String sentSQL = "INSERT into bancacajero.movimientos values(NULL,'"
                + cuenta.getIdUsuario() + "',"
                + cantidad + ",'"
                + concepto + "','"
                + fecha + "')";
        System.out.println(sentSQL);
        try {
            stmt.executeUpdate(sentSQL);
        } catch (SQLException e) {
            System.out.println("Error al insertar el movimiento de retirada" + e.toString());
        }
    }

    /**
     *
     * @return devolvemos las cuentas con todos los datos que hay en la base de
     * datos.
     */
    public static List<Cuenta> getCuentas() {
        List<Cuenta> listaCuentas = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.CUENTAS");
            while (rs.next()) {
                Cuenta cuenta = new Cuenta();
                cuenta.setIdCuenta(rs.getInt(1));
                cuenta.setIdUsuario(rs.getInt(2));
                cuenta.setSaldo(rs.getInt(3));
                listaCuentas.add(cuenta);
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar cuenta " + ex.toString());
        }
        return listaCuentas;
    }

    /**
     *
     * @return devolvemos todas las tarjetas que se encuentrasn en la base de
     * datos.
     */
    public static List<Tarjeta> getTarjetas() {
        List<Tarjeta> listaTarjeta = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bancacajero.TARJETAS");
            //Recorremos el resultset. SIEMPRE se hace igual.
            while (rs.next()) {
                Tarjeta tarjeta = new Tarjeta();
                tarjeta.setIdTarjeta(rs.getInt(1));
                tarjeta.setIdCuenta(rs.getInt(2));
                tarjeta.setPin(rs.getInt(3));
                tarjeta.setTarjeta_bloqueo(rs.getInt(4));
                listaTarjeta.add(tarjeta);
            }
        } catch (SQLException ex) {
            System.out.println("Error al recuperar tarjeta " + ex.toString());
        }
        return listaTarjeta;
    }

    /**
     *
     * @param idCuenta le pasamoa la cuenta que queremos borrar de la base de
     * datos.
     */
    public static void borrarCuenta(int idCuenta) {
        try {
            String sql = "DELETE FROM bancacajero.cuentas WHERE ID_CUENTA=" + idCuenta;
            stmt.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Borrado de cuenta correcto", "Operacion borrar", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            System.out.println("Error, al borarr la cuenta" + ex.toString());
        }
    }

    /**
     *
     * @param idUsuario le pasamos el usuario que quremos borrar de la base de
     * datos.
     */
    public static void borrarUsuario(int idUsuario) {
        try {
            String sql = "DELETE FROM bancacajero.usuarios WHERE ID_USUARIO=" + idUsuario;
            stmt.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Borrado de usuario correcto", "Operacion borrar", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            System.out.println("Error, al borarr el usuario" + ex.toString());
        }
    }

    /**
     *
     * @param idTarjeta le pasamos la tarjeta que queremos borrar de la base de
     * dtaos.
     */
    public static void borrarTarjeta(int idTarjeta) {
        try {
            String sql = "DELETE FROM bancacajero.tarjetas WHERE ID_TARJETA=" + idTarjeta;
            stmt.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Borrado de tarjeta correcto", "Operacion borrar", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            System.out.println("Error, al borarr la tarjeta" + ex.toString());
        }
    }

    /**
     *
     * @param idCuenta le pasamos el id cuenta sobre el que queremos efectuar la
     * accion.
     * @param saldo le pasamos el saldo que queremos actualizar.
     *
     */
    public static void updateCuenta(int idCuenta, int saldo) {
        try {
            String sql = ("UPDATE bancacajero.cuentas SET "
                    + " SALDO = " + saldo
                    + " WHERE ID_CUENTA = " + idCuenta);
            stmt.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Actualizada la cuenta", "Operacion actualizar", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            System.out.println("Error, al añadir cuenta" + ex.toString());
        }
    }

    /**
     *
     * @param idUsuario le pasamos el usuario nuevo
     * @param nombre el nombre nuevo.
     * @param apellido el apellido nuevo.
     */
    public static void updateUsuario(int idUsuario, String nombre, String apellido) {
        try {
            String sql = ("UPDATE bancacajero.usuarios SET "
                    + " nombre = '" + nombre
                    + "' ,apellido = '" + apellido
                    + "' WHERE ID_USUARIO = " + idUsuario);
            stmt.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Actualizado el usuario", "Operacion actualizar", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            System.out.println("Error, al añadir el usuario" + ex.toString());
        }
    }

    /**
     *
     * @param idTarjeta la tarjeta nueva
     * @param idCuenta la cuenta que queremos.
     * @param pin el neuvo pin
     * @param bloqueo si esta bloqueada o no.
     */
    public static void updateTarjeta(int idTarjeta, int idCuenta, int pin, int bloqueo) {
        try {
            String sql = ("UPDATE bancacajero.tarjetas SET "
                    + " ID_CUENTA = " + idCuenta
                    + " ,pin = " + pin
                    + " ,bloqueo = " + bloqueo
                    + " WHERE ID_TARJETA = " + idTarjeta);
            stmt.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Actualizada la tarjeta", "Operacion acutalizar", JOptionPane.OK_OPTION);
        } catch (SQLException e) {
            System.out.println("Error, al añadir la tarjeta");
        }
    }

    /**
     *
     * @param idTarjeta la tarjeta que queremos bloquear
     * @param bloqueo el bloqueo.
     */
    public static void tarjetaBloqueo(int idTarjeta, int bloqueo) {
        try {
            String sentSql = "UPDATE bancacajero.TARJETAS SET BLOQUEO = "
                    + bloqueo + " WHERE ID_TARJETA = " + idTarjeta;
            System.out.println(sentSql);
            stmt.executeUpdate(sentSql);
            JOptionPane.showMessageDialog(null, "Bloqueo correcto", "Operacion tarjetas", JOptionPane.OK_OPTION);
        } catch (SQLException e) {
            System.out.println("Error, al bloquear la tarjeta " + e.toString());
        }
    }

    /**
     *
     * @param idTarjeta la tarjeta que queremos desbloquear.
     * @param desbloqueo el desbloqueo.
     */
    public static void tarjetaDesbloqueo(int idTarjeta, int desbloqueo) {

        try {
            String sentSql = "UPDATE bancacajero.TARJETAS SET BLOQUEO = "
                    + desbloqueo + " WHERE ID_TARJETA = " + idTarjeta;
            System.out.println(sentSql);
            stmt.executeUpdate(sentSql);
            JOptionPane.showMessageDialog(null, "Desbloqueo correcto", "Operacion tarjetas", JOptionPane.OK_OPTION);
        } catch (SQLException e) {
            System.out.println("Error, al desbloquear la tarjeta " + e.toString());
        }
    }

    /**
     *
     * @param idCuenta la cuenta que quremos añadir.
     * @param idUsuario le usuario que queremos añadir.
     * @param saldo el saldor de esa cuenta.
     */
    public static void anadirCuenta(int idCuenta, int idUsuario, int saldo) {
        try {
            String sql = "INSERT into bancacajero.cuentas values(" + idCuenta + ","
                    + idUsuario + ","
                    + saldo + ")";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cuenta añadidada correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Error, al añadir cuenta" + e.toString());
        }
    }

    /**
     *
     * @param idUsuario el usuario que queremos añadir.
     * @param nombre el nombre de este.
     * @param apellido el apellido de este.
     */
    public static void anadirUsuario(int idUsuario, String nombre, String apellido) {
        try {
            String sql = "INSERT into bancacajero.usuarios values (" + idUsuario + ",'"
                    + nombre + "','"
                    + apellido + "')";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuario añadidado correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error, al añadir usuario" + e.toString());
        }
    }

    /**
     *
     * @param idTarjeta el id neuvo de la tarjeta
     * @param idUsuario el usuario.
     * @param pin el nuevo ping
     * @param bloqeo si esta bloqueada o no.
     */
    public static void anadirTarjeta(int idTarjeta, int idUsuario, int pin, int bloqeo) {
        try {
            String sql = "INSERT into bancacajero.tarjetas values (" + idTarjeta + ","
                    + idUsuario + ","
                    + pin + ","
                    + bloqeo + ")";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tarjeta añadida correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error, al añadir tarjeta" + e.toString());
        }
    }

    /**
     *
     * @return devolvemos el numero de cuentas que hay.
     */
    public static int totalCuentas() {
        int totalCuentas = 0;
        try {
            String sql = "select ID_CUENTA from bancacajero.cuentas order by ID_CUENTA desc limit 1;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                totalCuentas = rs.getInt(1);
            }
            System.out.println(totalCuentas);

        } catch (SQLException e) {
            System.out.println("Error, al conseguir las cuentas");
        }
        return totalCuentas;
    }

    /**
     *
     * @return devolbemos el numero de usuarios que hay.
     */
    public static int totalUsuarios() {
        int totalUsu = 0;
        try {
            String sql = "select ID_USUARIO from bancacajero.usuarios order by ID_USUARIO desc limit 1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                totalUsu = rs.getInt(1);
            }
            System.out.println(totalUsu);

        } catch (SQLException e) {
            System.out.println("Error, al conseguir los usuarios");
        }
        return totalUsu;
    }

    /**
     *
     * @return devolvemos el numero de tarjetas en total.
     */
    public static int totalTarjetas() {
        int totaltarje = 0;
        try {
            String sql = "select ID_TARJETA from bancacajero.tarjetas order by ID_TARJETA desc limit 1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                totaltarje = rs.getInt(1);
            }
            System.out.println(totaltarje);

        } catch (SQLException e) {
            System.out.println("Error, al conseguir las tarjetas");
        }
        return totaltarje;
    }

    /**
     *
     * @return devolvemos el dinero que hay en el cajero.
     */
    public static int totalDinero() {
        int totalDinero = 0;
        try {
            String sql = "SELECT dinero FROM bancacajero.cajero;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                totalDinero = rs.getInt(1);
            }
            System.out.println(totalDinero);
        } catch (SQLException e) {
            System.out.println("Error, al conseguir el dinero");
        }
        return totalDinero;
    }

    /**
     *
     * @param cantidad actualizamos el dinero del cajero,dependiendo si
     * ingresamos o retiramos.
     */
    public static void updateCajero(int cantidad) {
        int id_cajero = 1;
        try {
            String sentSql = "UPDATE bancacajero.cajero SET Dinero = "
                    + cantidad + " WHERE ID_Cajero = " + id_cajero;
            System.out.println(sentSql);
            stmt.executeUpdate(sentSql);
        } catch (SQLException e) {
            System.out.println("Error al ingresar dinero en el cajero");
        }
    }

}
