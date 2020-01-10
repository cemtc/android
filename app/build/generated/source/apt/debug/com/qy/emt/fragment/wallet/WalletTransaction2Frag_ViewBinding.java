// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletTransaction2Frag_ViewBinding implements Unbinder {
  private WalletTransaction2Frag target;

  @UiThread
  public WalletTransaction2Frag_ViewBinding(WalletTransaction2Frag target, View source) {
    this.target = target;

    target.tvWalletTransaction = Utils.findRequiredViewAsType(source, R.id.tv_wallet_transaction, "field 'tvWalletTransaction'", TextView.class);
    target.rvWalletTransaction = Utils.findRequiredViewAsType(source, R.id.rv_wallet_transaction, "field 'rvWalletTransaction'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletTransaction2Frag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvWalletTransaction = null;
    target.rvWalletTransaction = null;
  }
}
