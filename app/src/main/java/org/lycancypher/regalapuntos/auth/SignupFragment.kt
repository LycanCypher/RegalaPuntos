package org.lycancypher.regalapuntos.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.lycancypher.regalapuntos.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding
    private lateinit var auth: FirebaseAuth

    private var userName = ""
    private var email = ""
    private var pass = ""
    private var repeatPass = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding = FragmentSignupBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = Firebase.auth

        with(binding) {
            etUsername.addTextChangedListener { userName = etUsername.text.toString() }

            etEmail.addTextChangedListener { email = etEmail.text.toString() }

            etPass.addTextChangedListener { pass = etPass.text.toString() }

            etPassConfirm.addTextChangedListener { repeatPass = etPassConfirm.text.toString() }

            btnSignUp.setOnClickListener {
                if (email.isNotEmpty() && pass.isNotEmpty()) {
                    val passEquals = pass == repeatPass
                    if (passEquals) {
                        if (pass.length >= 6) {
                            createAccount(userName, email, pass)
                        }
                        else {
                            //En caso de que la contraseña no cumpla con el tamaño mínimo
                        }
                    }
                    else {
                        //En caso de que las contraseñas no sean iguales
                    }
                }
                else {
                    //En caso de que falte un campo por llenar
                }

            }
        }
    }

    private fun createAccount(user: String, email: String, pass: String) {
    }

}