CREATE DATABASE IF NOT EXISTS libreriabd;
USE libreriabd;

CREATE TABLE autores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    nacionalidad VARCHAR(50),
    fecha_nacimiento DATE
);

CREATE TABLE categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    id_autor INT,
    id_categoria INT,
    precio DECIMAL(6,2),
    stock INT DEFAULT 0,
    FOREIGN KEY (id_autor) REFERENCES autores(id),
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(20)
);

INSERT INTO autores (nombre, nacionalidad, fecha_nacimiento) VALUES
('Gabriel García Márquez', 'Colombiana', '1927-03-06'),
('J.K. Rowling', 'Británica', '1965-07-31'),
('George Orwell', 'Británica', '1903-06-25'),
('Isabel Allende', 'Chilena', '1942-08-02'),
('Stephen King', 'Estadounidense', '1947-09-21');

INSERT INTO categorias (nombre) VALUES
('Novela'), ('Ciencia Ficción'), ('Terror'), ('Fantasía'), ('Historia');

INSERT INTO libros (titulo, id_autor, id_categoria, precio, stock) VALUES
('Cien años de soledad', 1, 1, 19.00, 10),
('Harry Potter y la piedra filosofal', 2, 4, 22.00, 15),
('1984', 3, 2, 15.00, 20),
('La casa de los espíritus', 4, 1, 18.00, 12),
('El resplandor', 5, 3, 24.00, 8),
('Fundación', 3, 2, 20.00, 10),
('Harry Potter y el prisionero de Azkaban', 2, 4, 23.00, 14),
('It', 5, 3, 27.00, 5),
('Ensayo sobre la ceguera', 1, 1, 16.00, 18),
('Los juegos del hambre', 4, 2, 21.00, 17);

INSERT INTO usuarios (nombre, email, password, direccion, telefono) VALUES
('Juan Pérez', 'juan@example.com', 'clave123', 'Calle A 123', '123456789'),
('María López', 'maria@example.com', 'password', 'Calle B 456', '987654321'),
('Carlos García', 'carlos@example.com', 'qwerty', 'Calle C 789', '456123789'),
('Ana Torres', 'ana@example.com', 'admin123', 'Avenida Z 999', '741852963'),
('Pedro Ramírez', 'pedro@example.com', 'testpass', 'Calle X 321', '369258147');