package sg.edu.rp.c346.id20008787.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    EditText etInputName;
    TextView tvPhoneNumber;
    EditText etInputPhoneNumber;
    TextView tvPax;
    EditText etInputPax;
    TextView tvSeatView;
    RadioGroup rgButton;
    RadioButton radioBtn1;
    RadioButton radioBtn2;
    TextView tvReservation;
    DatePicker dP;
    TextView tvTime;
    TimePicker tP;
    Button btnSubmit;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName.findViewById(R.id.tvName);
        etInputName.findViewById(R.id.etInputName);
        tvPhoneNumber.findViewById(R.id.tvPhoneNumber);
        etInputPhoneNumber.findViewById(R.id.etInputPhoneNumber);
        tvPax.findViewById(R.id.tvPax);
        etInputPax.findViewById(R.id.etInputPax);
        tvSeatView.findViewById(R.id.tvSeatView);
        rgButton.findViewById(R.id.rgButton);
        radioBtn1.findViewById(R.id.radioBtn1);
        radioBtn2.findViewById(R.id.radioBtn2);
        tvReservation.findViewById(R.id.tvReservation);
        dP.findViewById(R.id.dP);
        tvTime.findViewById(R.id.tvTime);
        tP.findViewById(R.id.tP);
        btnSubmit.findViewById(R.id.btnSubmit);
        btnReset.findViewById(R.id.btnReset);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                tvName.setText("Name :" + etInputName);
                tvPhoneNumber.setText("Phone Number :" + etInputPhoneNumber);
                tvPax.setText("Pax :" + etInputPax);

                if(radioBtn1.isChecked()) {
                    tvSeatView.setText("You will be seating at" + radioBtn1);
                } else {
                    tvSeatView.setText("You will be seating at" + radioBtn2);
                }
                tvReservation.setText("Reservation Date :" + dP);
                tvTime.setText("Reservation Time :" + tP);

                if(etInputName == null || etInputPhoneNumber == null || etInputPax == null) {
                    Toast.makeText(MainActivity.this, "Error Message", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tP.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                tvTime.setText(hourOfDay + minute);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etInputName.setText("");
                etInputPhoneNumber.setText("");
                etInputPax.setText("");
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                tvReservation.setText("");
                tvTime.setText("");
                tvName.setText("");
                tvPhoneNumber.setText("");
                tvPax.setText("");
                tvSeatView.setText("");

            }
        });






    }
}