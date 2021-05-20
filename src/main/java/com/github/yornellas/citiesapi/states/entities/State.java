package com.github.yornellas.citiesapi.states.entities;

import com.github.yornellas.citiesapi.countries.entities.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity(name = "state")
@Table(name = "estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})

public class State {

    @Id
    private Long id;

    @Column(name= "nome")
    private String name;

    private String uf;

    private Integer ibge;

    /*
    //1st
    @Column(name = "pais")
    private Integer countryId;*/

    //2nd Many To One
    @ManyToOne //muitos estados pertencem a um país
    @JoinColumn(name = "pais", referencedColumnName = "id") //retornará a entidade país e não somente o id
    private Country country;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public State() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    /*
    public Integer getCountryId() {
        return countryId;
    } */

    public Country getCountry() {
        return country;
    }

    public List<Integer> getDdd() {
        return ddd;
    }
}
