// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

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

public class ExportPrikeyAty_ViewBinding implements Unbinder {
  private ExportPrikeyAty target;

  @UiThread
  public ExportPrikeyAty_ViewBinding(ExportPrikeyAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ExportPrikeyAty_ViewBinding(ExportPrikeyAty target, View source) {
    this.target = target;

    target.nllWalletMarket = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nllWalletMarket'", NavigationLucencyLayout.class);
    target.lRecyclerView = Utils.findRequiredViewAsType(source, R.id.lr_id, "field 'lRecyclerView'", LRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ExportPrikeyAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletMarket = null;
    target.lRecyclerView = null;
  }
}
