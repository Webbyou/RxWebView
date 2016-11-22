package com.github.satoshun.reactivex.webview.data;


import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

public class OnReceivedHttpError implements RxWebViewData {

  private final WebResourceRequest request;
  private final WebResourceResponse errorResponse;

  public OnReceivedHttpError(WebResourceRequest request, WebResourceResponse errorResponse) {
    this.request = request;
    this.errorResponse = errorResponse;
  }

  public WebResourceRequest getRequest() {
    return request;
  }

  public WebResourceResponse getErrorResponse() {
    return errorResponse;
  }
}
