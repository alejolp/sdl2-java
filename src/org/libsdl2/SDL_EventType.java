/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_EventType {
  public final static SDL_EventType SDL_FIRSTEVENT = new SDL_EventType("SDL_FIRSTEVENT", sdl2javaJNI.SDL_FIRSTEVENT_get());
  public final static SDL_EventType SDL_QUIT = new SDL_EventType("SDL_QUIT", sdl2javaJNI.SDL_QUIT_get());
  public final static SDL_EventType SDL_APP_TERMINATING = new SDL_EventType("SDL_APP_TERMINATING");
  public final static SDL_EventType SDL_APP_LOWMEMORY = new SDL_EventType("SDL_APP_LOWMEMORY");
  public final static SDL_EventType SDL_APP_WILLENTERBACKGROUND = new SDL_EventType("SDL_APP_WILLENTERBACKGROUND");
  public final static SDL_EventType SDL_APP_DIDENTERBACKGROUND = new SDL_EventType("SDL_APP_DIDENTERBACKGROUND");
  public final static SDL_EventType SDL_APP_WILLENTERFOREGROUND = new SDL_EventType("SDL_APP_WILLENTERFOREGROUND");
  public final static SDL_EventType SDL_APP_DIDENTERFOREGROUND = new SDL_EventType("SDL_APP_DIDENTERFOREGROUND");
  public final static SDL_EventType SDL_WINDOWEVENT = new SDL_EventType("SDL_WINDOWEVENT", sdl2javaJNI.SDL_WINDOWEVENT_get());
  public final static SDL_EventType SDL_SYSWMEVENT = new SDL_EventType("SDL_SYSWMEVENT");
  public final static SDL_EventType SDL_KEYDOWN = new SDL_EventType("SDL_KEYDOWN", sdl2javaJNI.SDL_KEYDOWN_get());
  public final static SDL_EventType SDL_KEYUP = new SDL_EventType("SDL_KEYUP");
  public final static SDL_EventType SDL_TEXTEDITING = new SDL_EventType("SDL_TEXTEDITING");
  public final static SDL_EventType SDL_TEXTINPUT = new SDL_EventType("SDL_TEXTINPUT");
  public final static SDL_EventType SDL_MOUSEMOTION = new SDL_EventType("SDL_MOUSEMOTION", sdl2javaJNI.SDL_MOUSEMOTION_get());
  public final static SDL_EventType SDL_MOUSEBUTTONDOWN = new SDL_EventType("SDL_MOUSEBUTTONDOWN");
  public final static SDL_EventType SDL_MOUSEBUTTONUP = new SDL_EventType("SDL_MOUSEBUTTONUP");
  public final static SDL_EventType SDL_MOUSEWHEEL = new SDL_EventType("SDL_MOUSEWHEEL");
  public final static SDL_EventType SDL_JOYAXISMOTION = new SDL_EventType("SDL_JOYAXISMOTION", sdl2javaJNI.SDL_JOYAXISMOTION_get());
  public final static SDL_EventType SDL_JOYBALLMOTION = new SDL_EventType("SDL_JOYBALLMOTION");
  public final static SDL_EventType SDL_JOYHATMOTION = new SDL_EventType("SDL_JOYHATMOTION");
  public final static SDL_EventType SDL_JOYBUTTONDOWN = new SDL_EventType("SDL_JOYBUTTONDOWN");
  public final static SDL_EventType SDL_JOYBUTTONUP = new SDL_EventType("SDL_JOYBUTTONUP");
  public final static SDL_EventType SDL_JOYDEVICEADDED = new SDL_EventType("SDL_JOYDEVICEADDED");
  public final static SDL_EventType SDL_JOYDEVICEREMOVED = new SDL_EventType("SDL_JOYDEVICEREMOVED");
  public final static SDL_EventType SDL_CONTROLLERAXISMOTION = new SDL_EventType("SDL_CONTROLLERAXISMOTION", sdl2javaJNI.SDL_CONTROLLERAXISMOTION_get());
  public final static SDL_EventType SDL_CONTROLLERBUTTONDOWN = new SDL_EventType("SDL_CONTROLLERBUTTONDOWN");
  public final static SDL_EventType SDL_CONTROLLERBUTTONUP = new SDL_EventType("SDL_CONTROLLERBUTTONUP");
  public final static SDL_EventType SDL_CONTROLLERDEVICEADDED = new SDL_EventType("SDL_CONTROLLERDEVICEADDED");
  public final static SDL_EventType SDL_CONTROLLERDEVICEREMOVED = new SDL_EventType("SDL_CONTROLLERDEVICEREMOVED");
  public final static SDL_EventType SDL_CONTROLLERDEVICEREMAPPED = new SDL_EventType("SDL_CONTROLLERDEVICEREMAPPED");
  public final static SDL_EventType SDL_FINGERDOWN = new SDL_EventType("SDL_FINGERDOWN", sdl2javaJNI.SDL_FINGERDOWN_get());
  public final static SDL_EventType SDL_FINGERUP = new SDL_EventType("SDL_FINGERUP");
  public final static SDL_EventType SDL_FINGERMOTION = new SDL_EventType("SDL_FINGERMOTION");
  public final static SDL_EventType SDL_DOLLARGESTURE = new SDL_EventType("SDL_DOLLARGESTURE", sdl2javaJNI.SDL_DOLLARGESTURE_get());
  public final static SDL_EventType SDL_DOLLARRECORD = new SDL_EventType("SDL_DOLLARRECORD");
  public final static SDL_EventType SDL_MULTIGESTURE = new SDL_EventType("SDL_MULTIGESTURE");
  public final static SDL_EventType SDL_CLIPBOARDUPDATE = new SDL_EventType("SDL_CLIPBOARDUPDATE", sdl2javaJNI.SDL_CLIPBOARDUPDATE_get());
  public final static SDL_EventType SDL_DROPFILE = new SDL_EventType("SDL_DROPFILE", sdl2javaJNI.SDL_DROPFILE_get());
  public final static SDL_EventType SDL_USEREVENT = new SDL_EventType("SDL_USEREVENT", sdl2javaJNI.SDL_USEREVENT_get());
  public final static SDL_EventType SDL_LASTEVENT = new SDL_EventType("SDL_LASTEVENT", sdl2javaJNI.SDL_LASTEVENT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_EventType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_EventType.class + " with value " + swigValue);
  }

  private SDL_EventType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_EventType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_EventType(String swigName, SDL_EventType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_EventType[] swigValues = { SDL_FIRSTEVENT, SDL_QUIT, SDL_APP_TERMINATING, SDL_APP_LOWMEMORY, SDL_APP_WILLENTERBACKGROUND, SDL_APP_DIDENTERBACKGROUND, SDL_APP_WILLENTERFOREGROUND, SDL_APP_DIDENTERFOREGROUND, SDL_WINDOWEVENT, SDL_SYSWMEVENT, SDL_KEYDOWN, SDL_KEYUP, SDL_TEXTEDITING, SDL_TEXTINPUT, SDL_MOUSEMOTION, SDL_MOUSEBUTTONDOWN, SDL_MOUSEBUTTONUP, SDL_MOUSEWHEEL, SDL_JOYAXISMOTION, SDL_JOYBALLMOTION, SDL_JOYHATMOTION, SDL_JOYBUTTONDOWN, SDL_JOYBUTTONUP, SDL_JOYDEVICEADDED, SDL_JOYDEVICEREMOVED, SDL_CONTROLLERAXISMOTION, SDL_CONTROLLERBUTTONDOWN, SDL_CONTROLLERBUTTONUP, SDL_CONTROLLERDEVICEADDED, SDL_CONTROLLERDEVICEREMOVED, SDL_CONTROLLERDEVICEREMAPPED, SDL_FINGERDOWN, SDL_FINGERUP, SDL_FINGERMOTION, SDL_DOLLARGESTURE, SDL_DOLLARRECORD, SDL_MULTIGESTURE, SDL_CLIPBOARDUPDATE, SDL_DROPFILE, SDL_USEREVENT, SDL_LASTEVENT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

