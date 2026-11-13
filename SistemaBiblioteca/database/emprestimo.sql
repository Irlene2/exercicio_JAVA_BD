SELECT
    usuario.nome AS nome_usuario,
    item.titulo AS titulo_item,
    emprestimo.data_retirada,
    emprestimo.data_devolucao_prevista
FROM emprestimo
INNER JOIN usuario
    ON emprestimo.usuario_id = usuario.id
INNER JOIN item
    ON emprestimo.item_id = item.id
WHERE emprestimo.data_devolucao IS NULL;