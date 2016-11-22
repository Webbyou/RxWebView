package com.github.satoshun.reactivex.webview.data;

import android.view.KeyEvent;

public class OnUnhandledKeyEvent implements RxWebViewData {

  private final KeyEvent event;

  public OnUnhandledKeyEvent(KeyEvent event) {
    this.event = event;
  }

  public KeyEvent getEvent() {
    return event;
  }
}
