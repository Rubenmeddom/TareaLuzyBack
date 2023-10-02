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
@Table(name = "facturas")
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facturaid")
    private Integer facturaid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contratoid", nullable = true)
    private Contratos contratoid;
    @Column(name="codigofactura")
    private int codigofactura;
}
