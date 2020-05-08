  INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
	('ram', '$2a$10$JbbmhhNhopCEex2d.SwtruEJ9Wv.J3MGenbR8XzmEGmqeswmnJfqK', 'Ram Chadar', 'ROLE_ADMIN', 'US', 1),
	('amol', '$2a$10$xI3PbbeI7IT3tbrlFYrh9OfKM5IaQldoS6SWC0S1f7tZ97h23k0K6', 'Amol Bansode', 'ROLE_USER', 'India', 1); 

   INSERT INTO `topics` (`topic_id`, `title`, `category`) VALUES
	(1, 'Spring Rest Boot', 'Spring Boot'),
	(2, 'Spring Boot Security', 'Spring Boot'),
	(3, 'Spring MVC Framework', 'Spring Framework');