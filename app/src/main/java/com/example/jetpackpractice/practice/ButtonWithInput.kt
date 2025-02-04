import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonWithInput(modifier: Modifier = Modifier) {
    // Using remember to store mutable state without 'by' delegate
    val inputText = remember { mutableStateOf("") }
    val displayText = remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = inputText.value,
            onValueChange = { inputText.value = it },
            label = { Text("Enter something") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { displayText.value = inputText.value }) {
            Text("Submit")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text("Submitted Text: ${displayText.value}")
    }
}
