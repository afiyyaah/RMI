/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AfiaVader
 */
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {
    public static void main(String[]args)throws RemoteException{
        client cc=new client();
        cc.connectRemote();
        
    }
        
    private void connectRemote() throws RemoteException{
        try{
            Scanner sc=new Scanner(System.in);
            Registry r=LocateRegistry.getRegistry("justMe",9999);
            adder a=(adder)r.lookup("Server, you there?");
            System.out.println("Enter two numbers");
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            System.out.println("Addition is "+a.add(a1,b1));
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
    
}
