#include "kxp84.h"

void readRegister(){
	i2c_write_byte();
	i2c_write_byte();
	i2c_read_byte();
}
