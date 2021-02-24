package be.vdab.repositories;

import java.io.IOException;
import java.math.BigDecimal;

public interface PersoonRepository {
    BigDecimal[] findAllWeddes() throws IOException;
}
