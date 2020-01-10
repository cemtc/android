// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import com.qy.emt.view.group.TransactionLinearLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletTransferSuccessAty_ViewBinding implements Unbinder {
  private WalletTransferSuccessAty target;

  @UiThread
  public WalletTransferSuccessAty_ViewBinding(WalletTransferSuccessAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletTransferSuccessAty_ViewBinding(WalletTransferSuccessAty target, View source) {
    this.target = target;

    target.nllTransferSuccess = Utils.findRequiredViewAsType(source, R.id.nll_transfer_success, "field 'nllTransferSuccess'", NavigationLucencyLayout.class);
    target.tllTransferHash = Utils.findRequiredViewAsType(source, R.id.tll_transfer_hash, "field 'tllTransferHash'", TransactionLinearLayout.class);
    target.tllTransferBlock = Utils.findRequiredViewAsType(source, R.id.tll_transfer_block, "field 'tllTransferBlock'", TransactionLinearLayout.class);
    target.tllTransferTime = Utils.findRequiredViewAsType(source, R.id.tll_transfer_time, "field 'tllTransferTime'", TransactionLinearLayout.class);
    target.tllTransferFrom = Utils.findRequiredViewAsType(source, R.id.tll_transfer_from, "field 'tllTransferFrom'", TransactionLinearLayout.class);
    target.tllTransferTo = Utils.findRequiredViewAsType(source, R.id.tll_transfer_to, "field 'tllTransferTo'", TransactionLinearLayout.class);
    target.tllTransferPrice = Utils.findRequiredViewAsType(source, R.id.tll_transfer_price, "field 'tllTransferPrice'", TransactionLinearLayout.class);
    target.tllTransferFee = Utils.findRequiredViewAsType(source, R.id.tll_transfer_fee, "field 'tllTransferFee'", TransactionLinearLayout.class);
    target.tvTransferSuccess = Utils.findRequiredViewAsType(source, R.id.tv_transfer_success, "field 'tvTransferSuccess'", TextView.class);
    target.tvTransferAmount = Utils.findRequiredViewAsType(source, R.id.tv_transfer_amount, "field 'tvTransferAmount'", TextView.class);
    target.coin_name = Utils.findRequiredViewAsType(source, R.id.coin_name, "field 'coin_name'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletTransferSuccessAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllTransferSuccess = null;
    target.tllTransferHash = null;
    target.tllTransferBlock = null;
    target.tllTransferTime = null;
    target.tllTransferFrom = null;
    target.tllTransferTo = null;
    target.tllTransferPrice = null;
    target.tllTransferFee = null;
    target.tvTransferSuccess = null;
    target.tvTransferAmount = null;
    target.coin_name = null;
  }
}
