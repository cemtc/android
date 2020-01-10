// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MarketFrag_ViewBinding implements Unbinder {
  private MarketFrag target;

  @UiThread
  public MarketFrag_ViewBinding(MarketFrag target, View source) {
    this.target = target;

    target.nllWalletMarket = Utils.findRequiredViewAsType(source, R.id.nll_main, "field 'nllWalletMarket'", NavigationLucencyLayout.class);
    target.lr_id = Utils.findRequiredViewAsType(source, R.id.lr_id, "field 'lr_id'", LRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MarketFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletMarket = null;
    target.lr_id = null;
  }
}
