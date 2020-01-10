// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletTransferAty_ViewBinding implements Unbinder {
  private WalletTransferAty target;

  private View view2131296909;

  private View view2131296525;

  @UiThread
  public WalletTransferAty_ViewBinding(WalletTransferAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletTransferAty_ViewBinding(final WalletTransferAty target, View source) {
    this.target = target;

    View view;
    target.nllWalletTransfer = Utils.findRequiredViewAsType(source, R.id.nll_wallet_transafer, "field 'nllWalletTransfer'", NavigationLucencyLayout.class);
    target.etTransferState = Utils.findRequiredViewAsType(source, R.id.et_transfer_state, "field 'etTransferState'", EditText.class);
    target.etTransferAmunt = Utils.findRequiredViewAsType(source, R.id.et_transfer_amount, "field 'etTransferAmunt'", EditText.class);
    target.sbWalletTransfer = Utils.findRequiredViewAsType(source, R.id.sb_wallet_transfer, "field 'sbWalletTransfer'", SeekBar.class);
    target.tvTransferFee = Utils.findRequiredViewAsType(source, R.id.tv_transfer_fee, "field 'tvTransferFee'", TextView.class);
    target.tvTransferFee1 = Utils.findRequiredViewAsType(source, R.id.tv_trafser_fee1, "field 'tvTransferFee1'", TextView.class);
    target.tvTransferFee2 = Utils.findRequiredViewAsType(source, R.id.tv_trafser_fee2, "field 'tvTransferFee2'", TextView.class);
    target.tvTransferAmount = Utils.findRequiredViewAsType(source, R.id.tv_transfer_amount, "field 'tvTransferAmount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_wallet_transfer, "method 'onClick'");
    view2131296909 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_transfer_code, "method 'onClick'");
    view2131296525 = view;
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
    WalletTransferAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletTransfer = null;
    target.etTransferState = null;
    target.etTransferAmunt = null;
    target.sbWalletTransfer = null;
    target.tvTransferFee = null;
    target.tvTransferFee1 = null;
    target.tvTransferFee2 = null;
    target.tvTransferAmount = null;

    view2131296909.setOnClickListener(null);
    view2131296909 = null;
    view2131296525.setOnClickListener(null);
    view2131296525 = null;
  }
}
