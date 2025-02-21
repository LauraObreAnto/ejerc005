package es.santander.ascender.ejerc005.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc005.model.Documento;

@SpringBootTest
public class DocumentoRepositoryTest {
    @Autowired
    private DocumentoRepository repository;

    @Test
    public void testCreate() {
        Documento documento = new Documento();
        documento.setNombre("Contrato");
        documento.setExtension(".pdf");
        documento.setBorrado(false);
        documento.setPersona_id(3l);

        repository.save(documento);
        assertTrue(
                repository
                        .findById(documento.getId())
                        .isPresent());
    }

    @Test
    public void delete() {
        Documento documento = new Documento();
        documento.setNombre("Contrato");
        documento.setExtension(".pdf");
        documento.setBorrado(false);
        documento.setPersona_id(3l);

        repository.save(documento);
        assertTrue(
                repository
                        .findById(documento.getId())
                        .isPresent());
        repository.deleteById(documento.getId());
    }

    @Test
    public void update() {
        Documento documento = new Documento();
        documento.setNombre("Contrato");
        documento.setExtension(".pdf");
        documento.setBorrado(false);
        documento.setPersona_id(3l);

        repository.save(documento);
        assertTrue(
                repository
                        .existsById(documento.getId()));
        documento.setNombre("Autorizacion");
        repository.save(documento);
        Optional<Documento> updatedDocumento = repository.findById(documento.getId());
        assertTrue(updatedDocumento.isPresent());
        assertTrue(updatedDocumento.get().getNombre() == "Autorizacion");
    }
}
