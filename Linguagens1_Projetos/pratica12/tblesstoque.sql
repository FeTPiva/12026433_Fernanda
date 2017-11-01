SELECT idestoque, p.idprodutos, idestoque, idFornecedor, dataa FROM estoque as e
join produtos as p
on p.idprodutos = e.idprod