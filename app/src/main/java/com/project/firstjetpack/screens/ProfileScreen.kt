import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import coil.compose.rememberAsyncImagePainter
import com.project.firstjetpack.R
import com.project.firstjetpack.model.ProfileUiState
import com.project.firstjetpack.viewmodel.ProfileViewModel

@Composable
fun ProfileScreen(profileViewModel: ProfileViewModel) {
    val profileUiState = profileViewModel.profileUiState.collectAsState().value

    val onChangeFirstName: (String) -> Unit = profileViewModel::onChangeFirstName
    val onChangeLastName: (String) -> Unit = profileViewModel::onChangeLastName
    val onChangeEmail: (String) -> Unit = profileViewModel::onChangeEmail
    val onChangeCity: (String) -> Unit = profileViewModel::onChangeCity
    val onChangePhone: (String) -> Unit = profileViewModel::onChangePhone

    ProfileContent(
        profileUiState,
        onChangeFirstName,
        onChangeLastName,
        onChangeEmail,
        onChangeCity,
        onChangePhone
    )
}

@Composable
private fun ProfileContent(
    profileUiState: ProfileUiState,
    onChangeFirstName: (String) -> Unit,
    onChangeLastName: (String) -> Unit,
    onChangeEmail: (String) -> Unit,
    onChangeCity: (String) -> Unit,
    onChangePhone: (String) -> Unit

) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(148.dp)
                .padding(bottom = 16.dp)
        ) {
            val image: Painter = rememberAsyncImagePainter(model = profileUiState.imageUrl)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.BottomEnd)
                    .size(48.dp)
                    .clip(CircleShape)
                    .clickable { /* Handle image edit click */ }
            ) {
                Icon(
                    imageVector = Icons.Filled.Edit,
                    contentDescription = null,
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .size(24.dp)
                )
            }
        }
        OutlinedTextField(
            value = profileUiState.firstName,
            onValueChange = onChangeFirstName,
            label = { Text("First Name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = profileUiState.lastName,
            onValueChange = onChangeLastName,
            label = { Text("Last Name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = profileUiState.email,
            onValueChange = onChangeEmail,
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = profileUiState.city,
            onValueChange = onChangeCity,
            label = { Text("City") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = profileUiState.phone,
            onValueChange = onChangePhone,
            label = { Text("Phone") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier.fillMaxWidth()
        )
    }
}
