 # Pega o caminho do arquivo que você passar como argumento
 param($filePath)

 # Lê o conteúdo do arquivo
 $content = Get-Content $filePath

 # Filtra: Remove a linha que começa com 'package' e troca 'BEE100x' por 'Main'
 $cleanContent = $content | Where-Object { $_ -notmatch "^package " }
 $cleanContent = $cleanContent -replace "public class BEE\d+", "public class Main"

 # Transforma em texto único e joga no Clipboard (CTRL+C)
 $cleanContent | Set-Clipboard

 Write-Host "Pronto! Código formatado e copiado para o Beecrowd." -ForegroundColor Green