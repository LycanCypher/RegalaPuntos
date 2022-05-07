package org.lycancypher.regalapuntos.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.lycancypher.regalapuntos.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(view, savedInstanceState)

        auth = Firebase.auth

        handleClick()
    }

    private fun handleClick() {
        with(binding) {

        }
    }
}