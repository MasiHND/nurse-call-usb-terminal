# NurseCallUsbTerminalModifiedVersion

## App UI
![Image](https://github.com/user-attachments/assets/28c96f27-3353-4a65-989b-bc92c5eee721)
![Image](https://github.com/user-attachments/assets/b3eedbf1-73fd-4da5-8769-02cc9750e6c3)
![Image](https://github.com/user-attachments/assets/bef6ee3c-30ae-4e7f-a88f-088ac3212054)
![Image](https://github.com/user-attachments/assets/5e076680-1a55-4e71-bda1-abc0e8656503)

All Credits of SimpleUsbTerminal to [kai-morich](https://github.com/kai-morich)
You Can find base code at [SimpleUsbTerminal](https://github.com/kai-morich/SimpleUsbTerminal)

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/83070da7805b4899820e285d2f7847b9)](https://www.codacy.com/manual/kai-morich/SimpleUsbTerminal?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kai-morich/SimpleUsbTerminal&amp;utm_campaign=Badge_Grade)

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
