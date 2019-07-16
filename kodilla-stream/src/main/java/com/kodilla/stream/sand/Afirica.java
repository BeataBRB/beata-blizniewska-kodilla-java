package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Afirica implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("99999999901234567890");
        return sandQuantity;
    }
}
