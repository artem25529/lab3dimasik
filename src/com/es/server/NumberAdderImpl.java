package com.es.server;

import java.rmi.RemoteException;

public class NumberAdderImpl implements NumberAdder {
    @Override
    public int getSum(String s) throws RemoteException {
        return s.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }
}
