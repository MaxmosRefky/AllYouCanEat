package com.portaFoglio.AllYouCanEat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "menu")
public class Menu {
    @Id
    @Column(name = "menu_id")
    Integer menuId;

    //ff
}
