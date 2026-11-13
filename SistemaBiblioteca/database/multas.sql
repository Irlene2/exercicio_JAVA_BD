SELECT
    usuario.nome AS nome_usuario,
    COALESCE(SUM(emprestimo.valor_multa), 0) AS total_multas
FROM usuario
LEFT JOIN emprestimo
    ON usuario.id = emprestimo.usuario_id
GROUP BY usuario.id, usuario.nome;