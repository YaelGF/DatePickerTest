package yei.datepickertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.time.Month

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etDate=findViewById<EditText>(R.id.etDate)
        etDate.setOnClickListener { showDatePickerDialog() }
    }
    private fun showDatePickerDialog(){
        val datePicker = DatePickerFragment({day, month, year -> onDateSelected(day, month, year)})
        datePicker.show(supportFragmentManager, "datePicker")
    }

    fun onDateSelected ( day:Int, month:Int, year:Int){
        val etDate = findViewById<EditText>(R.id.etDate)
        var month = month+1
        etDate.setText("Elegiste el día $day del mes $month del año $year")

    }
}