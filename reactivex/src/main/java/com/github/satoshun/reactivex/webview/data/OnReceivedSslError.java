package com.github.satoshun.reactivex.webview.data;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;

public class OnReceivedSslError implements RxWebViewData {

  private final SslErrorHandler handler;
  private final SslError error;

  public OnReceivedSslError(SslErrorHandler handler, SslError error) {
    this.handler = handler;
    this.error = error;
  }

  public SslErrorHandler getHandler() {
    return handler;
  }

  public SslError getError() {
    return error;
  }
}
