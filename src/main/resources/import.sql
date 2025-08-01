-- Pacientes
INSERT INTO paciente (codigo_identificacion, fecha_nacimiento, dni, nombre) VALUES ('P001', '1990-03-14', '12345678A', 'Miguel');
INSERT INTO paciente (codigo_identificacion, fecha_nacimiento, dni, nombre) VALUES ('P002', '1985-07-22', '87654321B', 'Luis');
INSERT INTO paciente (codigo_identificacion, fecha_nacimiento, dni, nombre) VALUES ('P003', '2000-11-05', '11223344C', 'Pedro');
INSERT INTO paciente (codigo_identificacion, fecha_nacimiento, dni, nombre) VALUES ('P004', '1978-01-30', '44556677D', 'Laura');
INSERT INTO paciente (codigo_identificacion, fecha_nacimiento, dni, nombre) VALUES ('P005', '1995-09-18', '99887766E', 'Jennifer');

-- Médicos
INSERT INTO medico (nombre, especialidad) VALUES ('Dr. Marta Sánchez', 'Cardiología');
INSERT INTO medico (nombre, especialidad) VALUES ('Dr. Juan Pérez', 'Pediatría');
INSERT INTO medico (nombre, especialidad) VALUES ('Dra. Laura Gómez', 'Dermatología');
INSERT INTO medico (nombre, especialidad) VALUES ('Dr. Carlos Ruiz', 'Neurología');
INSERT INTO medico (nombre, especialidad) VALUES ('Dra. Ana Torres', 'Medicina General');
INSERT INTO medico (nombre, especialidad) VALUES ('Dra. San Juan', 'Dentista');

-- Citas
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-01 09:00:00', 'Chequeo general', 'PENDIENTE', 1, 1);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-02 10:30:00', 'Revisión pediátrica', 'PENDIENTE', 2, 2);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-03 15:00:00', 'Consulta dermatológica', 'PENDIENTE', 3, 3);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-04 09:15:00', 'Control cardiológico', 'CONFIRMADA', 1, 1);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-04 11:00:00', 'Chequeo general', 'CANCELADA', 2, 1);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-05 16:00:00', 'Consulta neurológica', 'PENDIENTE', 4, 4);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-06 08:45:00', 'Control dermatológico', 'CONFIRMADA', 5, 3);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-07 13:00:00', 'Revisión general', 'PENDIENTE', 3, 5);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-08 09:30:00', 'Seguimiento pediátrico', 'PENDIENTE', 2, 2);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-09 17:00:00', 'Consulta de neurología', 'CANCELADA', 1, 4);
INSERT INTO cita (fecha_hora, motivo, estado, paciente_id, medico_id) VALUES ('2025-08-08 11:30:00', 'Extracción de diente', 'CONFIRMADA', 1, 6);