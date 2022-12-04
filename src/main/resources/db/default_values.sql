# COMPLEXES
INSERT INTO `arroz`.`complexes` (`name`, `address`, `phone-number`, `price`, `open-at`, `close-at`) VALUES
('ITEK', 'Tashkent, M. Ulugbeki r. Akrganskaya str.', '+998994009444', '100000', '09:00', '22:00'),
('RTSHOR', 'Uzbekistan, 100125, Tashkent, Mirzo-Ulugbek district, m-v Yalangac', '+998712637570', '100000', '09:00', '18:00'),
('Aircraft Courts', 'Uzbekistan, Tashkent, Mashnuntol Street', '+998900130140', '100000', '08:00', '20:00'),
('MVES', 'Mirzo-Ulugbek Avenue 8a, Tashkent', '+998911351877', '120000', '07:00', '20:00'),
('Yunusobad', '1 Guards Colonel Khodjaev Street, Tashkent', '+998712347760', '180000', '06:00', '22:00'),
('Uchkun', 'Tashkent, Yunusabad district, Khusniobod mahalla', '+998977283222', '80000', '08:00', '20:00');

# BOOKING
INSERT INTO `arroz`.`booking` (`username`, `complexID`,`courtID`,`date`,`time`) VALUES
 ('temur', '2', '1', '12-12-22', '12:00'),
 ('asad', '3', '1', '13-12-22', '11:00'),
 ('putin', '1', '1', '11-12-22', '10:00');


# USERS
INSERT INTO `arroz`.`users` (`username`, `password`, `admin`) VALUES
('admin', 'dendi48902003st', true),
('dendi', 'qwerty', false);

# COURTS
INSERT INTO `arroz`.`courts` (`price`, `surface`, `type`, `phone-number`) VALUES
 ('120000', TRUE, 'outdoor', '+998997802949'),
 ('100000', FALSE, 'indoor', '+998997280878');


