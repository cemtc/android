// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletMnemonicAty_ViewBinding implements Unbinder {
  private WalletMnemonicAty target;

  private View view2131296857;

  @UiThread
  public WalletMnemonicAty_ViewBinding(WalletMnemonicAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletMnemonicAty_ViewBinding(final WalletMnemonicAty target, View source) {
    this.target = target;

    View view;
    target.nllWalletMnemonic = Utils.findRequiredViewAsType(source, R.id.nll_wallet_mnemonic, "field 'nllWalletMnemonic'", NavigationLucencyLayout.class);
    target.rvMnemonic = Utils.findRequiredViewAsType(source, R.id.rv_mnemonic, "field 'rvMnemonic'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.tv_mnemonic_next, "method 'onClick'");
    view2131296857 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletMnemonicAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletMnemonic = null;
    target.rvMnemonic = null;

    view2131296857.setOnClickListener(null);
    view2131296857 = null;
  }
}
