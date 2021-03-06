/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_RendererFlags {
  public final static SDL_RendererFlags SDL_RENDERER_SOFTWARE = new SDL_RendererFlags("SDL_RENDERER_SOFTWARE", sdl2javaJNI.SDL_RENDERER_SOFTWARE_get());
  public final static SDL_RendererFlags SDL_RENDERER_ACCELERATED = new SDL_RendererFlags("SDL_RENDERER_ACCELERATED", sdl2javaJNI.SDL_RENDERER_ACCELERATED_get());
  public final static SDL_RendererFlags SDL_RENDERER_PRESENTVSYNC = new SDL_RendererFlags("SDL_RENDERER_PRESENTVSYNC", sdl2javaJNI.SDL_RENDERER_PRESENTVSYNC_get());
  public final static SDL_RendererFlags SDL_RENDERER_TARGETTEXTURE = new SDL_RendererFlags("SDL_RENDERER_TARGETTEXTURE", sdl2javaJNI.SDL_RENDERER_TARGETTEXTURE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_RendererFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_RendererFlags.class + " with value " + swigValue);
  }

  private SDL_RendererFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_RendererFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_RendererFlags(String swigName, SDL_RendererFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_RendererFlags[] swigValues = { SDL_RENDERER_SOFTWARE, SDL_RENDERER_ACCELERATED, SDL_RENDERER_PRESENTVSYNC, SDL_RENDERER_TARGETTEXTURE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

