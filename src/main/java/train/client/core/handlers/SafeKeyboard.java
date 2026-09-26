package train.client.core.handlers;

import org.lwjgl.input.Keyboard;

/** Bounds-checked access to LWJGL's keyboard polling. */
public final class SafeKeyboard {
    private SafeKeyboard() {
    }

    public static boolean isKeyDown(int keyCode) {
        // Mouse bindings and malformed codes cannot index the keyboard buffer.
        // Returning false also lets existing release handling clear held controls.
        return keyCode >= 0 && keyCode < Keyboard.KEYBOARD_SIZE
                && Keyboard.isKeyDown(keyCode);
    }
}
