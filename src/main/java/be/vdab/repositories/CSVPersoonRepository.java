package be.vdab.repositories;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVPersoonRepository {
    public BigDecimal[] findAllWeddes() throws IOException {
        return Files.lines(Path.of("/data/personen.csv"))
                .map(regel -> new BigDecimal(regel.split(",")[3]))
                .toArray(BigDecimal[]::new);
    }
}
