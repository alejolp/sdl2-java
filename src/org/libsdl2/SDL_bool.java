/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_bool {
  public final static SDL_bool SDL_FALSE = new SDL_bool("SDL_FALSE", sdl2javaJNI.SDL_FALSE_get());
  public final static SDL_bool SDL_TRUE = new SDL_bool("SDL_TRUE", sdl2javaJNI.SDL_TRUE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_bool swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_bool.class + " with value " + swigValue);
  }

  private SDL_bool(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_bool(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_bool(String swigName, SDL_bool swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_bool[] swigValues = { SDL_FALSE, SDL_TRUE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

