/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_HapticEffect {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_HapticEffect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_HapticEffect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_HapticEffect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    sdl2javaJNI.SDL_HapticEffect_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return sdl2javaJNI.SDL_HapticEffect_type_get(swigCPtr, this);
  }

  public void setConstant(SDL_HapticConstant value) {
    sdl2javaJNI.SDL_HapticEffect_constant_set(swigCPtr, this, SDL_HapticConstant.getCPtr(value), value);
  }

  public SDL_HapticConstant getConstant() {
    long cPtr = sdl2javaJNI.SDL_HapticEffect_constant_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticConstant(cPtr, false);
  }

  public void setPeriodic(SDL_HapticPeriodic value) {
    sdl2javaJNI.SDL_HapticEffect_periodic_set(swigCPtr, this, SDL_HapticPeriodic.getCPtr(value), value);
  }

  public SDL_HapticPeriodic getPeriodic() {
    long cPtr = sdl2javaJNI.SDL_HapticEffect_periodic_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticPeriodic(cPtr, false);
  }

  public void setCondition(SDL_HapticCondition value) {
    sdl2javaJNI.SDL_HapticEffect_condition_set(swigCPtr, this, SDL_HapticCondition.getCPtr(value), value);
  }

  public SDL_HapticCondition getCondition() {
    long cPtr = sdl2javaJNI.SDL_HapticEffect_condition_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticCondition(cPtr, false);
  }

  public void setRamp(SDL_HapticRamp value) {
    sdl2javaJNI.SDL_HapticEffect_ramp_set(swigCPtr, this, SDL_HapticRamp.getCPtr(value), value);
  }

  public SDL_HapticRamp getRamp() {
    long cPtr = sdl2javaJNI.SDL_HapticEffect_ramp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticRamp(cPtr, false);
  }

  public void setLeftright(SDL_HapticLeftRight value) {
    sdl2javaJNI.SDL_HapticEffect_leftright_set(swigCPtr, this, SDL_HapticLeftRight.getCPtr(value), value);
  }

  public SDL_HapticLeftRight getLeftright() {
    long cPtr = sdl2javaJNI.SDL_HapticEffect_leftright_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticLeftRight(cPtr, false);
  }

  public void setCustom(SDL_HapticCustom value) {
    sdl2javaJNI.SDL_HapticEffect_custom_set(swigCPtr, this, SDL_HapticCustom.getCPtr(value), value);
  }

  public SDL_HapticCustom getCustom() {
    long cPtr = sdl2javaJNI.SDL_HapticEffect_custom_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticCustom(cPtr, false);
  }

  public SDL_HapticEffect() {
    this(sdl2javaJNI.new_SDL_HapticEffect(), true);
  }

}
