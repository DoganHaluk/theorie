package be.vdab.domain;

import java.math.BigDecimal;

public class Rekening {
    private BigDecimal saldo = BigDecimal.valueOf(0);
    public void stort(BigDecimal bedrag) {
        saldo = saldo.add(bedrag);
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
}
