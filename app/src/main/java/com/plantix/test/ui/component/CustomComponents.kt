package com.plantix.test.ui.component
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plantix.test.model.UserName
import com.plantix.test.ui.UsersViewModel
import java.util.*

@Composable
fun ListItem(userName: UserName, onClickListener: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .clickable(onClick = onClickListener)
    )
    {
        Text(
            text = userName.names.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() },
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Composable
fun UserList(userNames: List<UserName>, onClickListener: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())

    ) {
        userNames.forEachIndexed { index, userName ->
            ListItem(userName = userName, onClickListener = onClickListener)
            if (index < userNames.size - 1) {
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Composable
fun UserListCompose(
    viewModel: UsersViewModel,
    onItemClickListener: () -> Unit
) {
    val userNames: List<UserName> by viewModel.usersData.observeAsState(listOf())
    UserList(userNames, onClickListener = onItemClickListener)
}
