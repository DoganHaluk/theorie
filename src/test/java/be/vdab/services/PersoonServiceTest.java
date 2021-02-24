package be.vdab.services;

import be.vdab.repositories.PersoonRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import be.vdab.repositories.CSVPersoonRepository;

import static org.assertj.core.api.Assertions.assertThat;

class PersoonServiceTest {
    private PersoonService service;

    @BeforeEach
    void beforeEach() {
        service = new PersoonService(new PersoonRepositoryStub());
    }
    @Test
    void deWeddeStandaardAfwijkingIs2() throws IOException {
        assertThat(service.standaardAfwijkingWeddes()).isEqualByComparingTo("2");
    }
}