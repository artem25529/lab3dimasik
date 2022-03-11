package com.es.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NumberAdder extends Remote {
    int getSum(String s) throws RemoteException;
}
