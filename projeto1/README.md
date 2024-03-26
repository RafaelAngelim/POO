função add:
com base no que foi pedido, o usuário insere o nome, a quantidade e o preço do produto que deseja adicionar ao estoque
ao fazer isso, cria-se um novo array que advém do struct de produto, associando as informações inseridas ao produto novo no array

função rm:
com base no que foi pedido, a função verifica se o produto digitado pelo usuário se encontra no estoque, se não estiver uma mensagem avisando a ausência será exibida
caso ele esteja no estoque, cria-se uma variável booleana que se inicia falsa, e logo depois verifica-se a posição do produto no array do estoque
ao se obter a posição armazenada, o produto solicitado é substituido pelo seu próximo até que o array acabe e o produto solicitado fique na posição final do array
fazendo isso, ao subtrairmos um da quantidade de produtos, o último(o solicitado) é removido do array e valida a variáevel booleana
se for validada, o produto foi removido corretamente

função cons:
com base no que foi pedido, caso o usuário deseje verificar o valor e a quantidade de um certo produto no estoque ao usar a função
ela puxa os valores armazenados dentro do array e plota para o usuário caso o produto esteja no estoque
se por um acaso não estiver, um aviso de que o produto não foi encontrado será exibido 

função att:
com base no que foi pedido, caso o usuário se confunda ou queira mudar o preço ou a quantidade de um certo produto no estoque ele consegue se usar essa função
primeiro se escaneia o nome colocado no scanner e verifica-se por meio da iteração dentro do array se o produto se encontra no estoque
se estiver, todas as variáveis dentro do struct na posição respectiva ao produto são atualizadas com a nova entrada do usuário

função show:
caso o usuário esqueça ou queira checar o seu estoque inteiro, há a função show que resolve isso.
caso se chque a quantidade de produtos no estoque e não houver nenhum, uma mensagem que o estoque está vazio será exibida
se houver produtos, os mesmos serão impressos baseado no array do estoque e sendo atualizados com base na iteração da variável "i"    
além disso, se mostra a quantidade total de produtos no estoque e quantos tipos diferentes tem

função main:
mostra as opções as quais o usuário pode escolher, ao escolher um número de 1 a 6, o programa associa o número com uma das funções citadas acima
ao executar a função solicitada, o código permanece em loop até que o usuário informe que quer parar com o programa
caso coloque alguma entrada inválida, o programa emite um aviso até que a entrada seja correta
