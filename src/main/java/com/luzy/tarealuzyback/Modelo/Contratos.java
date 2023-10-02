package com.luzy.tarealuzyback.Modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contratos")
public class Contratos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contratoid")
    private Integer contratoid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clienteid", nullable = true)
    private Clientes clienteid;
    @Column(name="codigocontrato")
    private int codigocontrato;
}
