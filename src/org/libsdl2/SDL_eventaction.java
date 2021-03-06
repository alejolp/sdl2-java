/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_eventaction {
  public final static SDL_eventaction SDL_ADDEVENT = new SDL_eventaction("SDL_ADDEVENT");
  public final static SDL_eventaction SDL_PEEKEVENT = new SDL_eventaction("SDL_PEEKEVENT");
  public final static SDL_eventaction SDL_GETEVENT = new SDL_eventaction("SDL_GETEVENT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_eventaction swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_eventaction.class + " with value " + swigValue);
  }

  private SDL_eventaction(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_eventaction(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_eventaction(String swigName, SDL_eventaction swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_eventaction[] swigValues = { SDL_ADDEVENT, SDL_PEEKEVENT, SDL_GETEVENT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

