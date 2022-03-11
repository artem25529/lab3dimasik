package com.es.server;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain {
    public static final String UNIQUE_BINDING_NAME = "server.adder"; //имя сервиса

    public static void main(String[] args)
            throws RemoteException, InterruptedException, AlreadyBoundException {
        final NumberAdderImpl adder = new NumberAdderImpl();
        final Registry registry = LocateRegistry.createRegistry(2732);

        Remote stab = UnicastRemoteObject.exportObject(adder, 0);
        registry.bind(UNIQUE_BINDING_NAME, stab);
        Thread.sleep(Integer.MAX_VALUE);
    }
}
