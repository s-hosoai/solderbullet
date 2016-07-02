#ifdef __ATMEGA328_H
#define __ATMEGA328_H
void i2c_initializie();
unsigned char i2c_read_byte();
void i2c_write_byte();
void spi_initialize();
unsigned char spi_transfer();
unsigned char spi_read_byte();
void spi_write_byte();
void spi_end();
#endif
