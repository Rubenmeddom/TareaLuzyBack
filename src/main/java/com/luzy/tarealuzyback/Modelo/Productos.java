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
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productoid")
    private Integer productoid;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "facturaid", nullable = true)
    private Contratos facturaid;
    @Column(name="codigoproducto")
    private int codigoproducto;
    @Column(name="stock")
    private int stock;
}
