
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/83070da7805b4899820e285d2f7847b9)](https://www.codacy.com/manual/kai-morich/SimpleUsbTerminal?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kai-morich/SimpleUsbTerminal&amp;utm_campaign=Badge_Grade)
# NurseCallUsbTerminalModifiedVersion

## App UI
![Image](https://github.com/user-attachments/assets/91bfcdf6-841c-45ea-945b-d1c6d176842e)

All Credits of SimpleUsbTerminal to [kai-morich](https://github.com/kai-morich)
You Can find base code at [SimpleUsbTerminal](https://github.com/kai-morich/SimpleUsbTerminal)

# SimpleUsbTerminal

This Android app provides a line-oriented terminal / console for devices with a serial / UART interface connected with a USB-to-serial-converter.

It supports USB to serial converters based on
- FTDI FT232, FT2232, ...
- Prolific PL2303
- Silabs CP2102, CP2105, ...
- Qinheng CH340, CH341

and devices implementing the USB CDC protocol like
- Arduino using ATmega32U4
- Digispark using V-USB software USB
- BBC micro:bit using ARM mbed DAPLink firmware
- Pi Pico
- ...

## Features

- permission handling on device connection
- foreground service to buffer receive data while the app is rotating, in background, ...
- send BREAK
- show control lines
- RTS/CTS, DTR/DSR, XON/XOFF flow control

## Credits

The app uses the [usb-serial-for-android](https://github.com/mik3y/usb-serial-for-android) library.
