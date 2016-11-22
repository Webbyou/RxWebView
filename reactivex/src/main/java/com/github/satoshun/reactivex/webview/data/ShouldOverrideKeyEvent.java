package com.github.satoshun.reactivex.webview.data;

import android.view.KeyEvent;

public class ShouldOverrideKeyEvent implements RxWebViewData {

  private final KeyEvent event;

  public ShouldOverrideKeyEvent(KeyEvent event) {
    this.event = event;
  }

  public KeyEvent getEvent() {
    return event;
  }
}
