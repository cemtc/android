// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment.find;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WebViewAty_ViewBinding implements Unbinder {
  private WebViewAty target;

  @UiThread
  public WebViewAty_ViewBinding(WebViewAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WebViewAty_ViewBinding(WebViewAty target, View source) {
    this.target = target;

    target.myv_advertising = Utils.findRequiredViewAsType(source, R.id.webview_contract, "field 'myv_advertising'", MyWebView.class);
    target.iv_arrows_lift = Utils.findRequiredViewAsType(source, R.id.iv_arrows_lift, "field 'iv_arrows_lift'", ImageView.class);
    target.iv_arrows_home = Utils.findRequiredViewAsType(source, R.id.iv_arrows_home, "field 'iv_arrows_home'", ImageView.class);
    target.url_title = Utils.findRequiredViewAsType(source, R.id.url_title, "field 'url_title'", TextView.class);
    target.iv_bar_two = Utils.findRequiredViewAsType(source, R.id.iv_bar_two, "field 'iv_bar_two'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WebViewAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.myv_advertising = null;
    target.iv_arrows_lift = null;
    target.iv_arrows_home = null;
    target.url_title = null;
    target.iv_bar_two = null;
  }
}
