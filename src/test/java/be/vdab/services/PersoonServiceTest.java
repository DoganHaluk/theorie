package be.vdab.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import be.vdab.repositories.CSVPersoonRepository;

import static org.assertj.core.api.Assertions.assertThat;

class PersoonServiceTest {
    private PersoonService service;

    @BeforeEach
    void beforeEach() {
        service = new PersoonService();
    }

    @Test
    void deWeddeStandaardAfwijkingIsPositief() throws IOException {
        assertThat(service.standaardAfwijkingWeddes()).isPositive();
    }
}