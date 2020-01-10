// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletTransactionAty_ViewBinding implements Unbinder {
  private WalletTransactionAty target;

  private View view2131296956;

  private View view2131296894;

  private View view2131296889;

  @UiThread
  public WalletTransactionAty_ViewBinding(WalletTransactionAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletTransactionAty_ViewBinding(final WalletTransactionAty target, View source) {
    this.target = target;

    View view;
    target.nllWalletTrasaction = Utils.findRequiredViewAsType(source, R.id.nll_wallet_transaction, "field 'nllWalletTrasaction'", NavigationLucencyLayout.class);
    target.tvTransactionAmount = Utils.findRequiredViewAsType(source, R.id.tv_transaction_amount, "field 'tvTransactionAmount'", TextView.class);
    target.tvTransactionPrice = Utils.findRequiredViewAsType(source, R.id.tv_transaction_price, "field 'tvTransactionPrice'", TextView.class);
    target.walletAddressId = Utils.findRequiredViewAsType(source, R.id.wallet_address_id, "field 'walletAddressId'", TextView.class);
    view = Utils.findRequiredView(source, R.id.wallet_address_copy, "field 'walletAddressCopyImg' and method 'onClick'");
    target.walletAddressCopyImg = Utils.castView(view, R.id.wallet_address_copy, "field 'walletAddressCopyImg'", ImageView.class);
    view2131296956 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.trans_list_id = Utils.findRequiredViewAsType(source, R.id.trans_list_id, "field 'trans_list_id'", LRecyclerView.class);
    view = Utils.findRequiredView(source, R.id.tv_transaction_transfer, "method 'onClick'");
    view2131296894 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_transaction_gathering, "method 'onClick'");
    view2131296889 = view;
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
    WalletTransactionAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletTrasaction = null;
    target.tvTransactionAmount = null;
    target.tvTransactionPrice = null;
    target.walletAddressId = null;
    target.walletAddressCopyImg = null;
    target.trans_list_id = null;

    view2131296956.setOnClickListener(null);
    view2131296956 = null;
    view2131296894.setOnClickListener(null);
    view2131296894 = null;
    view2131296889.setOnClickListener(null);
    view2131296889 = null;
  }
}
