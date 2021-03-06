/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_JoystickGUID {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_JoystickGUID(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_JoystickGUID obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_JoystickGUID(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setData(SWIGTYPE_p_unsigned_char value) {
    sdl2javaJNI.SDL_JoystickGUID_data_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getData() {
    long cPtr = sdl2javaJNI.SDL_JoystickGUID_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public SDL_JoystickGUID() {
    this(sdl2javaJNI.new_SDL_JoystickGUID(), true);
  }

}
