/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_TextEditingEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_TextEditingEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_TextEditingEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_TextEditingEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(long value) {
    sdl2javaJNI.SDL_TextEditingEvent_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return sdl2javaJNI.SDL_TextEditingEvent_type_get(swigCPtr, this);
  }

  public void setTimestamp(long value) {
    sdl2javaJNI.SDL_TextEditingEvent_timestamp_set(swigCPtr, this, value);
  }

  public long getTimestamp() {
    return sdl2javaJNI.SDL_TextEditingEvent_timestamp_get(swigCPtr, this);
  }

  public void setWindowID(long value) {
    sdl2javaJNI.SDL_TextEditingEvent_windowID_set(swigCPtr, this, value);
  }

  public long getWindowID() {
    return sdl2javaJNI.SDL_TextEditingEvent_windowID_get(swigCPtr, this);
  }

  public void setText(String value) {
    sdl2javaJNI.SDL_TextEditingEvent_text_set(swigCPtr, this, value);
  }

  public String getText() {
    return sdl2javaJNI.SDL_TextEditingEvent_text_get(swigCPtr, this);
  }

  public void setStart(int value) {
    sdl2javaJNI.SDL_TextEditingEvent_start_set(swigCPtr, this, value);
  }

  public int getStart() {
    return sdl2javaJNI.SDL_TextEditingEvent_start_get(swigCPtr, this);
  }

  public void setLength(int value) {
    sdl2javaJNI.SDL_TextEditingEvent_length_set(swigCPtr, this, value);
  }

  public int getLength() {
    return sdl2javaJNI.SDL_TextEditingEvent_length_get(swigCPtr, this);
  }

  public SDL_TextEditingEvent() {
    this(sdl2javaJNI.new_SDL_TextEditingEvent(), true);
  }

}
