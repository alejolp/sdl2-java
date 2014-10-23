%module sdl2java

%{

#define SDL_MAIN_HANDLED
#include <SDL2/SDL.h>

%}

%include "typemaps.i"
%include "stdint.i"
%include "cpointer.i"

%pointer_functions(short, shortp);
%pointer_functions(int, intp);
%pointer_functions(float, floatp);
%pointer_functions(size_t, size_tp);

#define DECLSPEC
#define SDLCALL
#define SDL_FORCE_INLINE

/*
typedef int8_t Sint8;
typedef uint8_t Uint8;
typedef int16_t Sint16;
typedef uint16_t Uint16;
typedef int32_t Sint32;
typedef uint32_t Uint32;
*/

%ignore SDL_vsnprintf;
%ignore SDL_LogMessageV; 

%include "SDL2/SDL.h"
%include "SDL2/SDL_main.h"

%include "SDL2/SDL_stdinc.h"
%include "SDL2/SDL_assert.h"
%include "SDL2/SDL_atomic.h"

%include "SDL2/SDL_rect.h"
%include "SDL2/SDL_audio.h"
%include "SDL2/SDL_clipboard.h"
%include "SDL2/SDL_cpuinfo.h"
%include "SDL2/SDL_endian.h"
%include "SDL2/SDL_error.h"
%include "SDL2/SDL_events.h"
%include "SDL2/SDL_joystick.h"
%include "SDL2/SDL_gamecontroller.h"
%include "SDL2/SDL_haptic.h"
%include "SDL2/SDL_hints.h"
%include "SDL2/SDL_loadso.h"
%include "SDL2/SDL_log.h"
%include "SDL2/SDL_messagebox.h"
%include "SDL2/SDL_mutex.h"
%include "SDL2/SDL_power.h"
%include "SDL2/SDL_render.h"
%include "SDL2/SDL_rwops.h"
%include "SDL2/SDL_system.h"
%include "SDL2/SDL_thread.h"
%include "SDL2/SDL_timer.h"
%include "SDL2/SDL_version.h"
%include "SDL2/SDL_surface.h"
%include "SDL2/SDL_video.h"
%include "SDL2/SDL_scancode.h"
%include "SDL2/SDL_keycode.h"
%include "SDL2/SDL_keyboard.h"

