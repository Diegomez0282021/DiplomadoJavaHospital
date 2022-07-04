package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Iduser;
    private String Name;
    private String Lastname;
    private String Document;
    private String Username;
    private String Password;
    private String Registerdate;
    private Long Idrol;
    private Long Iddocumenttypes;





}
