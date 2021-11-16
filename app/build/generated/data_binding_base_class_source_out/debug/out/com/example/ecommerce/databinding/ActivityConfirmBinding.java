// Generated by view binder compiler. Do not edit!
package com.example.ecommerce.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.ecommerce.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConfirmBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button confirmButton;

  @NonNull
  public final EditText confirmationCityName;

  @NonNull
  public final EditText confirmationHomeAddress;

  @NonNull
  public final EditText confirmationName;

  @NonNull
  public final EditText confirmationPhoneNumber;

  @NonNull
  public final TextView textView2;

  private ActivityConfirmBinding(@NonNull ConstraintLayout rootView, @NonNull Button confirmButton,
      @NonNull EditText confirmationCityName, @NonNull EditText confirmationHomeAddress,
      @NonNull EditText confirmationName, @NonNull EditText confirmationPhoneNumber,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.confirmButton = confirmButton;
    this.confirmationCityName = confirmationCityName;
    this.confirmationHomeAddress = confirmationHomeAddress;
    this.confirmationName = confirmationName;
    this.confirmationPhoneNumber = confirmationPhoneNumber;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_confirm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConfirmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirmButton;
      Button confirmButton = rootView.findViewById(id);
      if (confirmButton == null) {
        break missingId;
      }

      id = R.id.confirmationCityName;
      EditText confirmationCityName = rootView.findViewById(id);
      if (confirmationCityName == null) {
        break missingId;
      }

      id = R.id.confirmationHomeAddress;
      EditText confirmationHomeAddress = rootView.findViewById(id);
      if (confirmationHomeAddress == null) {
        break missingId;
      }

      id = R.id.confirmationName;
      EditText confirmationName = rootView.findViewById(id);
      if (confirmationName == null) {
        break missingId;
      }

      id = R.id.confirmationPhoneNumber;
      EditText confirmationPhoneNumber = rootView.findViewById(id);
      if (confirmationPhoneNumber == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityConfirmBinding((ConstraintLayout) rootView, confirmButton,
          confirmationCityName, confirmationHomeAddress, confirmationName, confirmationPhoneNumber,
          textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}