package com.flavio.spring_mc.entities.models;

import com.flavio.spring_mc.enuns.TypeClient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {
    private Integer id;
    private String name;
    private String mail;
    private String cpfOrCnpj;
    private Integer typeClient;
    private Set<String> phones = new HashSet<>();

    private List<Address> addresses = new ArrayList<>();

    public Client() {
    }

    public Client(Integer id, String name, String mail, String cpfOrCnpj, TypeClient typeClient, Set<String> phones) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.cpfOrCnpj = cpfOrCnpj;
        this.typeClient = typeClient.getCod();
        this.phones = phones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public TypeClient getTypeClient() {
        return TypeClient.toEnum(typeClient);
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient.getCod();
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void addPhones(String phone) {
        getPhones().add(phone);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddress(Address address) {
        getAddresses().add(address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;

        if (getId() != null ? !getId().equals(client.getId()) : client.getId() != null) return false;
        return getName() != null ? getName().equals(client.getName()) : client.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", cpfOrCnpj='" + cpfOrCnpj + '\'' +
                ", typeClient=" + typeClient +
                ", phones=" + phones +
                ", addresses=" + addresses +
                '}';
    }
}
