package sg.edu.rp.c346.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var previous = 0.0
    val arrayList = ArrayList<String>()
    val arrayList1 = ArrayList<String>()
    var bool = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button
        when (btnSelected.id) {
            btn1.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "1"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "1"
                }
            }
            btn2.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "2"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "2"
                }
            }
            btn3.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "3"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "3"
                }
            }
            btn4.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "4"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "4"
                }
            }
            btn5.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "5"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "5"
                }
            }
            btn6.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "6"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "6"
                }
            }
            btn7.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "7"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "7"
                }
            }
            btn8.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "8"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "8"
                }
            }
            btn9.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "9"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "9"
                }
            }
            btn0.id -> {
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "0"
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "0"
                }
            }

            btnAdd.id -> {
                previous = textView.text.toString().toDouble()
                arrayList.add("$previous")
                arrayList1.add("add")
                bool = true
            }
            btnDiff.id -> {
                previous = textView.text.toString().toDouble()
                arrayList.add("$previous")
                arrayList1.add("minus")
                bool = true
            }
            btnMult.id -> {
                previous = textView.text.toString().toDouble()
                arrayList.add("$previous")
                arrayList1.add("mult")
                textView.text = ""
                bool = true
            }
            btnDiv.id -> {
                previous = textView.text.toString().toDouble()
                arrayList.add("$previous")
                arrayList1.add("div")
                bool = true
            }
            btnEqual.id -> {
                var final = arrayList.get(0).toDouble()
                var i = 1

                arrayList.add(textView.text.toString())

                while (i < arrayList.size) {
                    if (arrayList1.get(i-1).equals("add")) {
                        final = final + arrayList.get(i).toDouble()
                    } else if (arrayList1.get(i-1).equals("minus")) {
                        final = final - arrayList.get(i).toDouble()
                    } else if (arrayList1.get(i-1).equals("mult")){
                        final = final * arrayList.get(i).toDouble()
                    } else if (arrayList1.get(i-1).equals("div")){
                        final = final / arrayList.get(i).toDouble()
                    }
                    i++
                }
                arrayList.clear()
                arrayList1.clear()
                textView.text = "$final"
                bool = true
            }
            btnAc.id -> {
                arrayList.clear()
                arrayList1.clear()
                textView.text = "0"
            }
            btnDot.id ->{
                if (textView.text.toString().equals("0") || bool) {
                    textView.text = "0."
                    bool = false
                } else {
                    textView.text = textView.text.toString() + "."
                }
            }
        }

    }
}
