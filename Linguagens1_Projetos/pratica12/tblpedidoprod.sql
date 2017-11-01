SELECT rel.idtbl_pedido_produto, ped.idpedido, prod.idprodutos, rel.qntcdproduto, rel.precounitario, rel.precottl FROM tbl_pedido_produto as rel
join pedidos as ped
on rel.idpedido = rel.idpedido
join produtos as prod
on prod.idprodutos = rel.idproduto