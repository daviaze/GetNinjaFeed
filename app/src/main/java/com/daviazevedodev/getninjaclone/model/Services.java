package com.daviazevedodev.getninjaclone.model;

import java.util.Arrays;
import java.util.List;

public class Services {
    public static List<Service> fakeServices() {
        return Arrays.asList(
                Service.ServiceBuilder.builder()
                        .setNamePerson("Maria E.")
                        .setNameService("Marketing Online")
                        .setStatus("Serviço online")
                        .build(),

                Service.ServiceBuilder.builder()
                        .setNamePerson("Tarsis B.")
                        .setNameService("Desenvolvimento de Sites e Sistemas")
                        .setStatus("Serviço online")
                        .build(),

                Service.ServiceBuilder.builder()
                        .setNamePerson("Wellingthon M.")
                        .setNameService("Aplicativo para celular e redes sociais")
                        .setStatus("Serviço online")
                        .build(),

                Service.ServiceBuilder.builder()
                        .setNamePerson("Ana C.")
                        .setNameService("Desenvolvimento de Sites e Sistemas")
                        .setStatus("Serviço online")
                        .build(),

                Service.ServiceBuilder.builder()
                        .setNamePerson("Daniel Monastero")
                        .setNameService("Sistema web para empresas!")
                        .setStatus("Serviço online")
                        .build(),

                Service.ServiceBuilder.builder()
                        .setNamePerson("Daniel Monastero")
                        .setNameService("Sistema web para empresas!")
                        .setStatus("Serviço online")
                        .build()
        );
    }
}
