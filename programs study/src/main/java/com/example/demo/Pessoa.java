package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class Pessoa {

    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean metodo (List<Pessoa> pessoas) {

        String listaId = "id1,id2,id3";
        List<String> streamListaId = stream(listaId.split(",")).map(String::trim).collect(toList());

        System.out.println("stream lista: " + pessoas.stream().filter(x -> streamListaId.equals(x.getId())));


        return pessoas.stream().anyMatch(streamListaId::equals);
    }
}

// return streamListaId.stream().map(String::trim).anyMatch(pessoas::equals);
// pessoas.stream().filter(x -> streamListaId.equals(x.getId()));
