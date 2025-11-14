package dao;

import entities.Legajo;

import java.sql.Connection;
import java.sql.SQLException;

public interface EmpleadoLegajoDao {
    void setLegajo(String id, Legajo legajo) throws SQLException;
    void setLegajoTx(String id, Legajo legajo, Connection conn) throws SQLException;
}
