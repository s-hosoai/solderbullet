protocol gpio {
	initialize()
	int read_pin(int pinnum)
	write_pin(int pinnum, int value)
}
