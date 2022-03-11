package com.es.client;

import com.es.server.NumberAdder;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientMain {
    public static final String UNIQUE_BINDING_NAME = "server.adder";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(2732);
        NumberAdder adder = (NumberAdder) registry.lookup(UNIQUE_BINDING_NAME);

        String s = getUserInput();
        System.out.println(adder.getSum(s));
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input str pls");
        return scanner.nextLine();
    }
}
