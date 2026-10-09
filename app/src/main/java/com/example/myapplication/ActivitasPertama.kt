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

@Composable
fun KartuProfil(
    @StringRes nama: Int,
    @StringRes telp: Int?,
    @StringRes alamat: Int,
    @ColorRes warnaCard: Int,
    @DrawableRes gambar: Int,
    fontNama: FontFamily = FontFamily.Default,
    beratFont: FontWeight = FontWeight.Bold,
    ukuranNama: Int = 20
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = warnaCard)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = gambar),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = nama),
                    fontSize = ukuranNama.sp,
                    fontFamily = fontNama,
                    fontWeight = beratFont,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    color = colorResource(id = R.color.text_putih)
                )

                if (telp != null) {
                    Text(
                        text = stringResource(id = telp),
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.text_cyan)
                    )
                }

                Text(
                    text = stringResource(id = alamat),
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.text_kuning)
                )
            }

            Image(
                painter = painterResource(id = gambar),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}