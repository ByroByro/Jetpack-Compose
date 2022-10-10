package zw.co.byrosolutions.noteapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import zw.co.byrosolutions.noteapp.R
import zw.co.byrosolutions.noteapp.components.NoteButton
import zw.co.byrosolutions.noteapp.components.NoteInputText

@Composable
fun NoteScreen() {

    //
    var title by remember {
        mutableStateOf("")
    }

    var desription by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.padding(6.dp)) {
        TopAppBar(
            title = { Text(text = stringResource(id = R.string.app_name)) },
            actions = {
                Icon(
                    imageVector = Icons.Rounded.Notifications,
                    contentDescription = "Icon"
                )
            }, backgroundColor = Color(0xFFDADFE3)
        )

        // content
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // title
            NoteInputText(
                modifier = Modifier.padding(top = 9.dp, bottom = 9.dp),
                text = title,
                label = "Title",
                maxLine = 1,
                onTextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) title = it
                })
            // description
            NoteInputText(
                modifier = Modifier.padding(top = 9.dp, bottom = 9.dp),
                text = desription,
                label = "Add a note",
                maxLine = 1,
                onTextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) desription = it
                })
            //save button
            NoteButton(text = "Save", onClick = {

            })
        }
    }
}

@Preview
@Composable
fun NoteScreenPreview() {
    NoteScreen()
}