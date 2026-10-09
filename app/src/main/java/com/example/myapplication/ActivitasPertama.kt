package com.example.myapplication

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier, name: String) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_hitam)
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_hitam)
            )
            Spacer(modifier = Modifier.height(25.dp))

            Text(
                text = stringResource(id = R.string.copy),
                fontSize = 12.sp,
                color = colorResource(id = R.color.text_hitam),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}