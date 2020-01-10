// Generated code from Butter Knife. Do not modify!
package com.qy.emt.view.group;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TransactionLinearLayout_ViewBinding implements Unbinder {
  private TransactionLinearLayout target;

  @UiThread
  public TransactionLinearLayout_ViewBinding(TransactionLinearLayout target) {
    this(target, target);
  }

  @UiThread
  public TransactionLinearLayout_ViewBinding(TransactionLinearLayout target, View source) {
    this.target = target;

    target.tvTransactionTitle = Utils.findRequiredViewAsType(source, R.id.tv_transaction_title, "field 'tvTransactionTitle'", TextView.class);
    target.tvTransactionContext = Utils.findRequiredViewAsType(source, R.id.tv_transaction_context, "field 'tvTransactionContext'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TransactionLinearLayout target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTransactionTitle = null;
    target.tvTransactionContext = null;
  }
}
