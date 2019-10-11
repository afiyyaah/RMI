/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AfiaVader
 */
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class server extends UnicastRemoteObject implements adder{
    public server() throws RemoteException{
    
    }
    
    public int add(int n1,int n2) throws RemoteException{
        return n1+n2;
    }
    
    public static void main(String[]args) throws RemoteException{
        try{
            Registry r= LocateRegistry.createRegistry(9999);
            r.rebind("Welcome to new server", new server());
            System.out.println("Server has been built");
        }
        catch(RemoteException e){
            System.out.println("Exception: "+e);
        }
    }
}
