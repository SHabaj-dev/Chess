package com.sbz.chess.ui.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(
    titleText: String,
    fontSize: TextUnit = 18.sp,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center,
    fontWeight: FontWeight = FontWeight.Black,
    textColor: Color = Color.Black
) {

    Text(
        text = titleText,
        modifier = modifier,
        color = textColor,
        fontWeight = fontWeight,
        fontSize = fontSize,
        textAlign = textAlign
    )

}


@Preview(showSystemUi = true)
@Composable
private fun TitleTextPreview() {
    TitleText("This is Title")
}

