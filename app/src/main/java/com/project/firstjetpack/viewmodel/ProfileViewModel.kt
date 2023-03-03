package com.project.firstjetpack.viewmodel

import androidx.lifecycle.ViewModel
import com.project.firstjetpack.model.ProfileUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ProfileViewModel: ViewModel() {

    private val _profileUiState= MutableStateFlow(ProfileUiState())
    val profileUiState=_profileUiState.asStateFlow()

    fun onChangeFirstName(newValue:String){
            _profileUiState.update {
                it.copy(firstName = newValue)
            }
    }

    fun onChangeLastName(newValue:String){
          _profileUiState.update {
              it.copy(lastName = newValue)
          }
    }

    fun onChangeEmail(newValue:String){
        _profileUiState.update {
            it.copy(email = newValue)
        }
    }

    fun onChangeCity(newValue:String){
        _profileUiState.update {
            it.copy(city = newValue)
        }
    }

    fun onChangePhone(newValue:String){
        _profileUiState.update {
            it.copy(phone = newValue)
        }
    }
}