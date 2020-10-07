package com.daviazevedodev.getninjaclone.model;

public class Service {
    private String nameService;
    private String namePerson;
    private String status;

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ServiceBuilder {
        private String nameService;
        private String namePerson;
        private String status;


        public ServiceBuilder setNameService(String nameService) {
            this.nameService = nameService;
            return this;
        }

        public ServiceBuilder setNamePerson(String namePerson) {
            this.namePerson = namePerson;
            return this;

        }

        public ServiceBuilder setStatus(String status) {
            this.status = status;
            return this;

        }

        private ServiceBuilder() {}
        public static ServiceBuilder builder(){
            return new ServiceBuilder();
        }
        public Service build() {
            Service service = new Service();
            service.namePerson = namePerson;
            service.nameService = nameService;
            service.status = status;



            return service;
        }

    }
}
