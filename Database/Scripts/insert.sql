INSERT INTO `client` (`id_client`, `name`, `last_name`, `direction`, `birthdate`, `phone`, `email`) VALUES ('1', 'Maria', 'Lopez', 'Calle 10 No. 9 - 78  Centro', '1990-11-10', '123456789', 'maria@gmail.com');

INSERT INTO `product` (`id_product`, `name`, `price`, `stock`) VALUES ('1', 'vitamina', '2000', '4');

INSERT INTO `bill` (`num_bill`, `date_bill`, `id_client`) VALUES ('1', '2022-04-11', '1');

INSERT INTO `detail` (`num_detail`, `id_bill`, `id_product`, `amount`, `price`) VALUES ('1', '1', '1', '1', '2000');

