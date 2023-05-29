/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ClienteDao {
    List<Cliente> listaClientes();
    Cliente agregarCliente(Cliente cliente);
    void eliminarCliente(Integer id);
    Cliente atualizarCliente(Cliente cliente);
}