SELECT
    item.codigo,
    item.titulo,
    item.tipo
FROM item
LEFT JOIN emprestimo
    ON item.id = emprestimo.item_id
WHERE emprestimo.id IS NULL;