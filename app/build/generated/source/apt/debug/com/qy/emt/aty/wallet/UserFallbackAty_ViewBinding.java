// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserFallbackAty_ViewBinding implements Unbinder {
  private UserFallbackAty target;

  @UiThread
  public UserFallbackAty_ViewBinding(UserFallbackAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserFallbackAty_ViewBinding(UserFallbackAty target, View source) {
    this.target = target;

    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    target.user_nice_name_id = Utils.findRequiredViewAsType(source, R.id.user_nice_name_id, "field 'user_nice_name_id'", EditText.class);
    target.user_mobile = Utils.findRequiredViewAsType(source, R.id.user_mobile, "field 'user_mobile'", EditText.class);
    target.ques_type_id = Utils.findRequiredViewAsType(source, R.id.ques_type_id, "field 'ques_type_id'", Spinner.class);
    target.ques_content_id = Utils.findRequiredViewAsType(source, R.id.ques_content_id, "field 'ques_content_id'", EditText.class);
    target.botton_id = Utils.findRequiredViewAsType(source, R.id.botton_id, "field 'botton_id'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserFallbackAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
    target.user_nice_name_id = null;
    target.user_mobile = null;
    target.ques_type_id = null;
    target.ques_content_id = null;
    target.botton_id = null;
  }
}
