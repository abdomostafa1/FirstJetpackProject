package com.project.firstjetpack.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.firstjetpack.MainActivity
import com.project.firstjetpack.R
import com.project.firstjetpack.composable.*
import com.project.firstjetpack.ui.theme.*

@Preview(showBackground = true)
@Composable
fun HomeScreen(activity:MainActivity?=null) {

   Column(
      modifier = Modifier
         .fillMaxSize()
         .padding(32.dp, 16.dp, 16.dp, 16.dp)
   ) {

      Box(modifier = Modifier.size(50.dp), contentAlignment = Alignment.CenterStart) {
         Icon(painter = painterResource(id = R.drawable.arrow_ios_24), contentDescription = null)
      }
      SpacerVertical32()
      MediumText(text = "Settings", fontSize = 48.sp)
      SpacerVertical32()
      MediumText(text = "Account", fontSize = 24.sp)
      SpacerVertical32()

      Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
         CircleImage(painter = painterResource(id = R.drawable.reasonswhy))
         SpacerHorizontal16(modifier = Modifier.weight(1f))

         Column {
            NormalText(text = "David Clerisseau")
            SpacerVertical8()
            SmallText(text = "Personal Info", color = gray300)
         }
         SpacerHorizontal16(modifier = Modifier.weight(1f))
         FloatActionButton(
            painter = painterResource(id = R.drawable.arrow_forward_24),
            containerColor = gray200
         )
      }

      SpacerVertical48 ()
      MediumText(text = "Settings", fontSize = 24.sp)
      SpacerVertical32()

      Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

         Icon(painter = painterResource(id = R.drawable.beach_access_24), color = Orange200)
         SpacerHorizontal32()
         NormalText(text = "Language")
         SpacerHorizontal32(modifier = Modifier.weight(1f))
         SmallText(text = "English", color = gray300)
         SpacerHorizontal16()
         FloatActionButton(
            painter = painterResource(id = R.drawable.arrow_forward_24),
            containerColor = gray200
         )
      }

      SpacerVertical32()
      Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

         Icon(painter = painterResource(id = R.drawable.notifications_24), color = Blue200)
         SpacerHorizontal32()
         NormalText(text = "Notifications")
         SpacerHorizontal32(modifier = Modifier.weight(1f))
         FloatActionButton(
            painter = painterResource(id = R.drawable.arrow_forward_24),
            containerColor = gray200
         )
      }

      SpacerVertical32()
      Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
         Icon(painter = painterResource(id = R.drawable.bedtime_24), color = Blue200)
         SpacerHorizontal32()
         NormalText(text = "Dark Mode")
         SpacerHorizontal32(modifier = Modifier.weight(1f))
         SmallText(text = "Off", color = gray300)
         SpacerHorizontal16()
         Switch(checked = false, onCheckedChange = {})
      }

      SpacerVertical32()
      Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

         Icon(painter = painterResource(id = R.drawable.help_outline_24), color = Pink)
         SpacerHorizontal32()
         NormalText(text = "Help")
         SpacerHorizontal32(modifier = Modifier.weight(1f))
         FloatActionButton(
            painter = painterResource(id = R.drawable.arrow_forward_24),
            containerColor = gray200
         )
      }

   }
}
