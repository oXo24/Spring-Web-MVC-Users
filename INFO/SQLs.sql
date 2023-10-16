
-- БАЗА ДАНИХ
-- Можливість створення БД з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Можемо створити БД через візуальний інструмент, наприклад,
-- MySQL Workbench.
CREATE DATABASE demo_db;


-- ТАБЛИЦІ
-- Можливість створення таблиць БД, з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Попередньо, необхідно спроектувати таблиці та їх зв'язки,
-- на основі сутностей реального світу.
-- Можемо створити таблиці БД через візуальний інструмент, наприклад,
-- MySQL Workbench.

-- Для фінансових значень використано DECIMAL(M,D).
-- DECIMAL зберігає точні числові значення даних.
-- https://dev.mysql.com/doc/refman/8.0/en/fixed-point-types.html
-- M – максимальна кількість цифр (точність). Має діапазон від 1 до 65.
-- D – кількість цифр праворуч від коми (шкала). Має діапазон від 0 до 30
-- і не повинен перевищувати M.
-- https://dev.mysql.com/doc/refman/8.0/en/precision-math-decimal-characteristics.html
-- Грошовий вираз - цифрова інформація. Для грошових розрахунків FLOAT та DOUBLE
-- схильні до помилки округлення і можуть не підходити.
-- Для цього більше підходить DECIMAL (M, 2).
-- Однак, може не форматувати подання даних у HTML.

CREATE TABLE IF NOT EXISTS employees
( id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  surname VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS candidates
( id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  surname VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);