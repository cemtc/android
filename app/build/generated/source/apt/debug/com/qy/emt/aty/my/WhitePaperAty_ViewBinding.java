// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WhitePaperAty_ViewBinding implements Unbinder {
  private WhitePaperAty target;

  @UiThread
  public WhitePaperAty_ViewBinding(WhitePaperAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WhitePaperAty_ViewBinding(WhitePaperAty target, View source) {
    this.target = target;

    target.nllWalletMarket = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nllWalletMarket'", NavigationLucencyLayout.class);
    target.content_idl = Utils.findRequiredViewAsType(source, R.id.content_idl, "field 'content_idl'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WhitePaperAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletMarket = null;
    target.content_idl = null;
  }
}
