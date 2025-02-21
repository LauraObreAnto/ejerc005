package es.santander.ascender.ejerc005.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc005.model.Documento;
import es.santander.ascender.ejerc005.repository.DocumentoRepository;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository repository;

    public Documento create (Documento documento){
        if (documento.getId() != null) {
            throw new CrudSecurityException("Han tratado de modificar un registro documento utilizando la creación",
                                                 CRUDOperation.CREATE, 
                                                 documento.getId());
        }
        return repository.save(documento);
    }

    public Documento read(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Documento> read(){
        return repository.findAll();
    }

    public Documento update(Documento documento){
        if (documento.getId() == null) {
            throw new CrudSecurityException("Han tratado de crear un registro documento utilizando la modificación",
                                                 CRUDOperation.UPDATE, 
                                                 documento.getId());
        }
        return repository.save(documento);
    }

    public void delete(Long id){
        repository.deleteById(id);
        return;
    }
}


