#ifdef __ATMEGA328_H
#define __ATMEGA328_H
void i2c_initializie();
void i2c_read_byte();
void i2c_write_byte();
void spi_initialize();
void spi_transfer();
void spi_read_byte();
void spi_write_byte();
void spi_end();
#endif
