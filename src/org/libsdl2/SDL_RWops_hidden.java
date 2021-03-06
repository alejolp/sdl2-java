/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_RWops_hidden {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_RWops_hidden(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_RWops_hidden obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_RWops_hidden(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SDL_RWops_hidden_mem getMem() {
    long cPtr = sdl2javaJNI.SDL_RWops_hidden_mem_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_RWops_hidden_mem(cPtr, false);
  }

  public SDL_RWops_hidden_unknown getUnknown() {
    long cPtr = sdl2javaJNI.SDL_RWops_hidden_unknown_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_RWops_hidden_unknown(cPtr, false);
  }

  public SDL_RWops_hidden() {
    this(sdl2javaJNI.new_SDL_RWops_hidden(), true);
  }

}
