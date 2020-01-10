// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletTokenFrag_ViewBinding implements Unbinder {
  private WalletTokenFrag target;

  @UiThread
  public WalletTokenFrag_ViewBinding(WalletTokenFrag target, View source) {
    this.target = target;

    target.rvWalletToken = Utils.findRequiredViewAsType(source, R.id.rv_wallet_token, "field 'rvWalletToken'", RecyclerView.class);
    target.llIncludeGbt = Utils.findRequiredViewAsType(source, R.id.ll_include_gbt, "field 'llIncludeGbt'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletTokenFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvWalletToken = null;
    target.llIncludeGbt = null;
  }
}
