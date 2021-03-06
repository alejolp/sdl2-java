/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_HapticRamp {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_HapticRamp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_HapticRamp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_HapticRamp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    sdl2javaJNI.SDL_HapticRamp_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return sdl2javaJNI.SDL_HapticRamp_type_get(swigCPtr, this);
  }

  public void setDirection(SDL_HapticDirection value) {
    sdl2javaJNI.SDL_HapticRamp_direction_set(swigCPtr, this, SDL_HapticDirection.getCPtr(value), value);
  }

  public SDL_HapticDirection getDirection() {
    long cPtr = sdl2javaJNI.SDL_HapticRamp_direction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticDirection(cPtr, false);
  }

  public void setLength(long value) {
    sdl2javaJNI.SDL_HapticRamp_length_set(swigCPtr, this, value);
  }

  public long getLength() {
    return sdl2javaJNI.SDL_HapticRamp_length_get(swigCPtr, this);
  }

  public void setDelay(int value) {
    sdl2javaJNI.SDL_HapticRamp_delay_set(swigCPtr, this, value);
  }

  public int getDelay() {
    return sdl2javaJNI.SDL_HapticRamp_delay_get(swigCPtr, this);
  }

  public void setButton(int value) {
    sdl2javaJNI.SDL_HapticRamp_button_set(swigCPtr, this, value);
  }

  public int getButton() {
    return sdl2javaJNI.SDL_HapticRamp_button_get(swigCPtr, this);
  }

  public void setInterval(int value) {
    sdl2javaJNI.SDL_HapticRamp_interval_set(swigCPtr, this, value);
  }

  public int getInterval() {
    return sdl2javaJNI.SDL_HapticRamp_interval_get(swigCPtr, this);
  }

  public void setStart(short value) {
    sdl2javaJNI.SDL_HapticRamp_start_set(swigCPtr, this, value);
  }

  public short getStart() {
    return sdl2javaJNI.SDL_HapticRamp_start_get(swigCPtr, this);
  }

  public void setEnd(short value) {
    sdl2javaJNI.SDL_HapticRamp_end_set(swigCPtr, this, value);
  }

  public short getEnd() {
    return sdl2javaJNI.SDL_HapticRamp_end_get(swigCPtr, this);
  }

  public void setAttack_length(int value) {
    sdl2javaJNI.SDL_HapticRamp_attack_length_set(swigCPtr, this, value);
  }

  public int getAttack_length() {
    return sdl2javaJNI.SDL_HapticRamp_attack_length_get(swigCPtr, this);
  }

  public void setAttack_level(int value) {
    sdl2javaJNI.SDL_HapticRamp_attack_level_set(swigCPtr, this, value);
  }

  public int getAttack_level() {
    return sdl2javaJNI.SDL_HapticRamp_attack_level_get(swigCPtr, this);
  }

  public void setFade_length(int value) {
    sdl2javaJNI.SDL_HapticRamp_fade_length_set(swigCPtr, this, value);
  }

  public int getFade_length() {
    return sdl2javaJNI.SDL_HapticRamp_fade_length_get(swigCPtr, this);
  }

  public void setFade_level(int value) {
    sdl2javaJNI.SDL_HapticRamp_fade_level_set(swigCPtr, this, value);
  }

  public int getFade_level() {
    return sdl2javaJNI.SDL_HapticRamp_fade_level_get(swigCPtr, this);
  }

  public SDL_HapticRamp() {
    this(sdl2javaJNI.new_SDL_HapticRamp(), true);
  }

}
