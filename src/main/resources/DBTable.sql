CREATE TABLE `employee` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `employee_address` varchar(255) NOT NULL,
  `employee_name` varchar(255) NOT NULL,
  `grade` char(1) NOT NULL,
  `phone` bigint DEFAULT NULL,
  `salary` double NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `UK_fopic1oh5oln2khj8eat6ino0` (`email`),
  UNIQUE KEY `UK_buf2qp04xpwfp5qq355706h4a` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
