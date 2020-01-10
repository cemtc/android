// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserEarnRecordsAty_ViewBinding implements Unbinder {
  private UserEarnRecordsAty target;

  @UiThread
  public UserEarnRecordsAty_ViewBinding(UserEarnRecordsAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserEarnRecordsAty_ViewBinding(UserEarnRecordsAty target, View source) {
    this.target = target;

    target.nllWalletMarket = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nllWalletMarket'", NavigationLucencyLayout.class);
    target.lRecyclerView = Utils.findRequiredViewAsType(source, R.id.lv_id, "field 'lRecyclerView'", LRecyclerView.class);
    target.all_price = Utils.findRequiredViewAsType(source, R.id.all_price, "field 'all_price'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserEarnRecordsAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletMarket = null;
    target.lRecyclerView = null;
    target.all_price = null;
  }
}
