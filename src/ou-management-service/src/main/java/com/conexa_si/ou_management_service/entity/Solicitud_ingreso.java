package com.conexa_si.ou_management_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "solicitudes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solicitud_ingreso {
    String user_id;
    String ou_id;
    String estado;
    String fecha_solicitud;
}
