package com.tencent.mmdb;

public interface CrossProcessCursor extends Cursor {
    void fillWindow(int i, CursorWindow cursorWindow);

    CursorWindow getWindow();

    boolean onMove(int i, int i2);
}
