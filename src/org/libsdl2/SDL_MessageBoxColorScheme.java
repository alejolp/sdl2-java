/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_MessageBoxColorScheme {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_MessageBoxColorScheme(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_MessageBoxColorScheme obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_MessageBoxColorScheme(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setColors(SDL_MessageBoxColor value) {
    sdl2javaJNI.SDL_MessageBoxColorScheme_colors_set(swigCPtr, this, SDL_MessageBoxColor.getCPtr(value), value);
  }

  public SDL_MessageBoxColor getColors() {
    long cPtr = sdl2javaJNI.SDL_MessageBoxColorScheme_colors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_MessageBoxColor(cPtr, false);
  }

  public SDL_MessageBoxColorScheme() {
    this(sdl2javaJNI.new_SDL_MessageBoxColorScheme(), true);
  }

}
