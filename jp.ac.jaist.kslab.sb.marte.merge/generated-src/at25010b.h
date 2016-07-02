#ifdef __AT25010B_H
#define __AT25010B_H
void set_write_enable_latch();
void reset_write_enable_latch();
void read_status_register();
void write_status_register();
void read();
void write();
#endif
