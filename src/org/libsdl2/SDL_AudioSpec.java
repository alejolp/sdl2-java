/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_AudioSpec {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_AudioSpec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_AudioSpec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_AudioSpec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFreq(int value) {
    sdl2javaJNI.SDL_AudioSpec_freq_set(swigCPtr, this, value);
  }

  public int getFreq() {
    return sdl2javaJNI.SDL_AudioSpec_freq_get(swigCPtr, this);
  }

  public void setFormat(int value) {
    sdl2javaJNI.SDL_AudioSpec_format_set(swigCPtr, this, value);
  }

  public int getFormat() {
    return sdl2javaJNI.SDL_AudioSpec_format_get(swigCPtr, this);
  }

  public void setChannels(short value) {
    sdl2javaJNI.SDL_AudioSpec_channels_set(swigCPtr, this, value);
  }

  public short getChannels() {
    return sdl2javaJNI.SDL_AudioSpec_channels_get(swigCPtr, this);
  }

  public void setSilence(short value) {
    sdl2javaJNI.SDL_AudioSpec_silence_set(swigCPtr, this, value);
  }

  public short getSilence() {
    return sdl2javaJNI.SDL_AudioSpec_silence_get(swigCPtr, this);
  }

  public void setSamples(int value) {
    sdl2javaJNI.SDL_AudioSpec_samples_set(swigCPtr, this, value);
  }

  public int getSamples() {
    return sdl2javaJNI.SDL_AudioSpec_samples_get(swigCPtr, this);
  }

  public void setPadding(int value) {
    sdl2javaJNI.SDL_AudioSpec_padding_set(swigCPtr, this, value);
  }

  public int getPadding() {
    return sdl2javaJNI.SDL_AudioSpec_padding_get(swigCPtr, this);
  }

  public void setSize(long value) {
    sdl2javaJNI.SDL_AudioSpec_size_set(swigCPtr, this, value);
  }

  public long getSize() {
    return sdl2javaJNI.SDL_AudioSpec_size_get(swigCPtr, this);
  }

  public void setCallback(SWIGTYPE_p_f_p_void_p_unsigned_char_int__void value) {
    sdl2javaJNI.SDL_AudioSpec_callback_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_unsigned_char_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_unsigned_char_int__void getCallback() {
    long cPtr = sdl2javaJNI.SDL_AudioSpec_callback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_unsigned_char_int__void(cPtr, false);
  }

  public void setUserdata(SWIGTYPE_p_void value) {
    sdl2javaJNI.SDL_AudioSpec_userdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserdata() {
    long cPtr = sdl2javaJNI.SDL_AudioSpec_userdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SDL_AudioSpec() {
    this(sdl2javaJNI.new_SDL_AudioSpec(), true);
  }

}
