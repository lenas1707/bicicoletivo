-- Inserindo roles
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');

-- Inserindo usuário admin
INSERT INTO tb_user (name, email, password, ra) VALUES ('Admin', 'admin@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 123456);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);

-- Inserindo usuário cliente
INSERT INTO tb_user (name, email, password, ra) VALUES ('Cliente', 'cliente@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 789012);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

-- Inserindo bicicletas para o cliente
INSERT INTO tb_bike (marca, modelo, color, proprietary_id) VALUES ('Caloi', 'Mountain Bike', 'Vermelho', 2);
INSERT INTO tb_bike (marca, modelo, color, proprietary_id) VALUES ('Oggi', 'Speed', 'Azul', 2);

-- Inserindo mais um cliente
INSERT INTO tb_user (name, email, password, ra) VALUES ('João Silva', 'joao@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 345678);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);

-- Inserindo bicicleta para o João
INSERT INTO tb_bike (marca, modelo, color, proprietary_id) VALUES ('Trek', 'Mountain Bike', 'Preto', 3);